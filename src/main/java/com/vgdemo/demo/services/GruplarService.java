package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Gruplar;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repositories.KullaniciRepo;
import com.vgdemo.demo.repositories.GrupRepo;
import com.vgdemo.demo.wrappers.GrupOlusturWrapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GruplarService {

    private GrupRepo grupRepo;
    private KullaniciRepo kullaniciRepo;

    public GruplarService(GrupRepo grupRepo, KullaniciRepo kullaniciRepo) {
        this.grupRepo = grupRepo;
        this.kullaniciRepo = kullaniciRepo;
    }

    public List<Gruplar> getAll() {
        return grupRepo.findAll();
    }


    public List<Gruplar> getGrupByKullaniciId(Long kullaniciId) {
        return grupRepo.findByUyeler_kullaniciId(kullaniciId);
    }

    public Gruplar uyeEkle(int grupId, Long kullaniciId) {
        Optional<Gruplar> gruplar = grupRepo.findById(grupId);
        Optional<Kullanici> kullanici = kullaniciRepo.findById(kullaniciId);

        if (gruplar.isPresent() && (kullanici.isPresent())) {
            Gruplar grup = gruplar.get();
            Kullanici uye = kullanici.get();

            grup.grubaKullaniciEkle(uye);
            grup.setGrup_mevcut(grup.getGrup_mevcut()+1);
            grupRepo.save(grup);
            return grup;
        } else {
            return null;
        }
    }


    public Gruplar grupOlustur(Long olusturanId, GrupOlusturWrapper grupWrapper) {
        Optional<Kullanici> admin = kullaniciRepo.findById(olusturanId);
        Gruplar yeniGrup = new Gruplar();

        yeniGrup.setGrupOlusturan(kullaniciRepo.findById(olusturanId).get());

        yeniGrup.setGrup_hakkında(grupWrapper.getGrupAcıklamasi());
        yeniGrup.setGrupAdi(grupWrapper.getGrupAdi());
        yeniGrup.setOlusturulma_tarihi(grupWrapper.getOlusturulma_tarihi());
        yeniGrup.setGrup_mevcut(1);
        return grupRepo.save(yeniGrup);
    }
}