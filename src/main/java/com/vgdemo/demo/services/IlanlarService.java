package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Ilanlar;
import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.repositories.IlanlarRepo;
import com.vgdemo.demo.repositories.SirketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IlanlarService {

    private IlanlarRepo ilanlarRepo;

    @Autowired
    public IlanlarService(IlanlarRepo ilanlarRepo) {
        this.ilanlarRepo = ilanlarRepo;
    }

    //Tüm ilanlar
    public List<Ilanlar> getAllIlan() {
        return ilanlarRepo.findAll();
    }

    public List<Ilanlar> getIlanByCompany(Sirket sirket){
        return ilanlarRepo.findBySirket(sirket);
    }


    public Ilanlar getIlanById(Integer id){
        return ilanlarRepo.findById(id).orElse(null);
    }

    public Ilanlar ilanOlustur(Ilanlar ilan){
        return ilanlarRepo.save(ilan);
    }

    public String getBase64(Integer ilanId) {
        return ilanlarRepo.findById(ilanId).get().getResim();
    }
}
