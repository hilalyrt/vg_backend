package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.model.SirketLogo;
import com.vgdemo.demo.repositories.SirketLogoRepo;
import com.vgdemo.demo.repositories.SirketRepo;
import com.vgdemo.demo.wrappers.SirketLogoWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SirketService {

    private SirketRepo sirketRepo;

    @Autowired
    private SirketLogoRepo sirketLogoRepo;

    public SirketService(SirketRepo sirketRepo) {
        this.sirketRepo = sirketRepo;
    }


    public List<Sirket> getAllSirkets() {
     return sirketRepo.findAll();
    }

    public Sirket getOneSirket(Integer sirketID) {
        return sirketRepo.findById(sirketID).orElse(null);
    }

    public SirketLogo upload(SirketLogoWrapper sirketLogoWrapper){
        SirketLogo sirketLogo = new SirketLogo();
        sirketLogo.setSirket(sirketRepo.findById(sirketLogoWrapper.getSirketId()).get());
        sirketLogo.setContentType(sirketLogoWrapper.getContentType());
        sirketLogo.setBase64(sirketLogoWrapper.getBase64());
        sirketLogo.getSirket().setLogo(sirketLogoWrapper.getBase64());
        return sirketLogoRepo.save(sirketLogo);
    }




    public String getLogoBySirketId(Integer sirketId) {
        return sirketRepo.findById(sirketId).get().getLogo();
    }
}
