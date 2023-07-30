package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Basvuru;
import com.vgdemo.demo.model.Ilanlar;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repositories.BasvuruRepository;
import com.vgdemo.demo.requests.BasvuruCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasvuruService {

    private BasvuruRepository basvuruRepository;
    private KullanıcıService kullaniciService;
    private  IlanlarService ilanlarService;

    public BasvuruService(BasvuruRepository basvuruRepository,KullanıcıService kullaniciService,IlanlarService ilanlarService){

        this.basvuruRepository = basvuruRepository;
        this.kullaniciService = kullaniciService;
        this.ilanlarService=ilanlarService;
    }

    public List<Basvuru> getAllBasvuru() {
        return basvuruRepository.findAll();
    }

    public Basvuru saveOneBasvuru(Basvuru yeniBasvuru) {
        return basvuruRepository.save(yeniBasvuru);
    }

    public List<Basvuru> getAllKullaniciBasvuru(int kullaniciId) {
        return basvuruRepository.findByKullaniciKullaniciId(kullaniciId);
    }

    public Basvuru createOneBasvuru(BasvuruCreateRequest yeniBasvuruRequest){
        Kullanici kullanici = kullaniciService.getOneUserById(yeniBasvuruRequest.getKullaniciId());
        Ilanlar ilan= new Ilanlar();
        ilan = ilanlarService.ilanOlustur(ilan);
        Basvuru toSave = new Basvuru();
        toSave.setBasvuru_id(yeniBasvuruRequest.getId());
        toSave.setKullanici(kullanici);
        toSave.setIlan(ilan);

        return basvuruRepository.save(toSave);
    }
}
