package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.*;
import com.vgdemo.demo.service.KullanıcıService;
import com.vgdemo.demo.services.EgitimService;
import com.vgdemo.demo.wrappers.EgitimWrapper;
import com.vgdemo.demo.wrappers.SirketLogoWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/egitim")
public class EgitimController {
    private EgitimService egitimService;

    @Autowired
    private KullanıcıService kullanıcıService;


    public EgitimController(EgitimService egitimService, KullanıcıService kullanıcıService) {
        this.egitimService = egitimService;
        this.kullanıcıService = kullanıcıService;
    }

    @GetMapping
    public List<Egitim> getEgitimler(){
        return egitimService.getEgitimler();
    }

     @GetMapping("/{kullaniciId}")
        public Egitim getEgitimBilgileri(@PathVariable Long kullaniciId){
            return egitimService.getEgitimInfo(kullanıcıService.getOneUserById(kullaniciId));
        }



        @PostMapping("/egitim-olustur")
        public Egitim createEgitim( @RequestBody EgitimWrapper egitimWrapper){
           return egitimService.create(egitimWrapper);

    }



}
