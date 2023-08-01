package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Ilanlar;
import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.services.IlanlarService;
import com.vgdemo.demo.services.SirketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ilanlar")
public class IlanlarController {
    @Autowired
    private IlanlarService ilanlarService;

    @Autowired
    private SirketService sirketService;


    public IlanlarController(IlanlarService ilanlarService) {
        this.ilanlarService = ilanlarService;
    }

    @GetMapping
    public List<Ilanlar> getAllIlanlar(){
        return ilanlarService.getAllIlan();
    }


    @GetMapping("/sirketler/{sirketId}")
    public List<Ilanlar> getAdvertsByCompanyId(@PathVariable Integer sirketId) {
        if (sirketService.getOneSirket(sirketId) == null) {
            return null;
        }

        List<Ilanlar> ilanlar = ilanlarService.getIlanByCompany(sirketService.getOneSirket(sirketId));
        return ilanlar;
    }

    @PostMapping("/sirketler/{sirketId}")
    public ResponseEntity<Ilanlar> ilanOlustur(@PathVariable Integer sirketId, @RequestBody Ilanlar ilan) {
        Sirket sirket = sirketService.getOneSirket(sirketId);
        if (sirket == null) {
            return ResponseEntity.notFound().build();
        }
        ilan.setSirket(sirket);
        Ilanlar yeniIlan = ilanlarService.ilanOlustur(ilan);
        return ResponseEntity.status(HttpStatus.CREATED).body(yeniIlan);
    }

    @GetMapping("{ilanId}/resim")
    public String getBase64(@PathVariable Integer ilanId){
        return ilanlarService.getBase64(ilanId);
    }



}
