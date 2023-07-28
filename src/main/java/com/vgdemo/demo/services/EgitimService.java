package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Egitim;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.model.SirketLogo;
import com.vgdemo.demo.repos.KullaniciRepo;
import com.vgdemo.demo.repositories.EgitimRepo;
import com.vgdemo.demo.wrappers.EgitimWrapper;
import com.vgdemo.demo.wrappers.SirketLogoWrapper;
import jakarta.persistence.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EgitimService {

    private EgitimRepo egitimRepo;

    private KullaniciRepo kullaniciRepo;

    public EgitimService(EgitimRepo egitimRepo, KullaniciRepo kullaniciRepo) {
        this.egitimRepo = egitimRepo;
        this.kullaniciRepo = kullaniciRepo;
    }

    public Egitim getEgitimInfo(Kullanici kullanici) {
        return egitimRepo.getEgitimByKullanici(kullanici);

    }

    public List<Egitim> getEgitimler() {
        return egitimRepo.findAll();
    }

    public Egitim create(EgitimWrapper egitimWrapper) {
        Egitim egitim = new Egitim();
        egitim.setKullanici(kullaniciRepo.findById(egitimWrapper.getKullanici_id()).get());
        egitim.setOkul(egitimWrapper.getOkul());
        egitim.setSınıf(egitimWrapper.getSınıf());
        egitim.setBolum(egitimWrapper.getBolum());
        egitim.setFakulte(egitimWrapper.getFakulte());
        egitim.setHakkinda(egitimWrapper.getHakkinda());
        egitim.setOrtalama(egitimWrapper.getOrtalama());
        return egitimRepo.save(egitim);
    }

}
