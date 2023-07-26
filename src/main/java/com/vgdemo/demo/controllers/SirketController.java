package com.vgdemo.demo.controllers;


import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.model.SirketLogo;
import com.vgdemo.demo.services.SirketService;

import com.vgdemo.demo.wrappers.SirketLogoWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sirketler")
public class SirketController {

    private SirketService sirketService;

    public SirketController(SirketService sirketService) {
        this.sirketService = sirketService;
    }

    @GetMapping
    public List<Sirket> getAllSirket(){
        return sirketService.getAllSirkets();
    }

    @GetMapping("/{sirketID}")
    public Sirket getSirketById(@PathVariable Integer sirketID){
        return sirketService.getOneSirket(sirketID);
    }


    @PostMapping(value ="logo-yukle")
    public ResponseEntity<SirketLogo> upload(@RequestBody SirketLogoWrapper param){

        try{
            SirketLogo logo = sirketService.upload(param);
            return ResponseEntity.ok(logo);
        }catch(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();}
    }

    @GetMapping(value = "get-logo/{sirketId}")
    public String getLogo64BySirketId(@PathVariable Integer sirketId) {
        try {
            String logo = sirketService.getLogoBySirketId(sirketId);
            if (logo != null) {
                return logo;
            } else {
                System.out.println("Logo bulunamadı");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Hata ");
            return null;
        }
    }

}
