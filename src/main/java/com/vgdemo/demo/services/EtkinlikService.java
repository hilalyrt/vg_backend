package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Etkinlik;
import com.vgdemo.demo.repositories.EtkinlikRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtkinlikService {

    private EtkinlikRepo etkinlikRepo;

    public EtkinlikService(EtkinlikRepo etkinlikRepo) {
        this.etkinlikRepo = etkinlikRepo;
    }


    public List<Etkinlik> getAllEtkinliks() {
        return etkinlikRepo.findAll();
    }

    public Etkinlik getOneEtkinlik(Integer etkinlikId) {
        return etkinlikRepo.findById(etkinlikId).orElse(null);
    }

    public String getBase64(Integer etkinlikId) {
        return etkinlikRepo.findById(etkinlikId).get().getResim();
    }
}
