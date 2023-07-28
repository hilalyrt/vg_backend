package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Etkinlik;
import com.vgdemo.demo.services.EtkinlikService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etkinlikler")
public class EtkinlikController {

    private EtkinlikService etkinlikService;

    public EtkinlikController(EtkinlikService etkinlikService) {
        this.etkinlikService = etkinlikService;
    }

    @GetMapping
    public List<Etkinlik> getAllEtkinlik(){
        return etkinlikService.getAllEtkinliks();
    }

  @GetMapping("/{etkinlikId}")
        public Etkinlik getEtkinlikById(@PathVariable Integer etlinlikId){
            return etkinlikService.getOneEtkinlik(etlinlikId);
        }

        @GetMapping("/{etkinlikId}/resim ")
        public String getResimBase64(@PathVariable Integer etkinlikId){
            return etkinlikService.getBase64(etkinlikId);
            }



}
