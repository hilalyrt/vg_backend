package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.repositories.SirketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SirketService {

    private SirketRepo sirketRepo;

    public SirketService(SirketRepo sirketRepo) {
        this.sirketRepo = sirketRepo;
    }


    public List<Sirket> getAllSirkets() {
     return sirketRepo.findAll();
    }

    public Sirket getOneSirket(Integer sirketID) {
        return sirketRepo.findById(sirketID).orElse(null);
    }
}
