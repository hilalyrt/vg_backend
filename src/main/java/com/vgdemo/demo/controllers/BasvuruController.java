package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Basvuru;
import com.vgdemo.demo.model.BizeUlas;
import com.vgdemo.demo.repositories.BasvuruRepository;
import com.vgdemo.demo.requests.BasvuruCreateRequest;
import com.vgdemo.demo.services.BasvuruService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basvuru")

public class BasvuruController {
    private BasvuruService basvuruService;

    public BasvuruController(BasvuruService basvuruService){
        this.basvuruService = basvuruService;

    }

    @GetMapping
    public List<Basvuru> getAllBasvuru() {
        return basvuruService.getAllBasvuru();

    }
    @PostMapping
    public Basvuru createOneBasvuru(@RequestBody BasvuruCreateRequest yeniBasvuruRequest){

        return basvuruService.createOneBasvuru(yeniBasvuruRequest);
    }

    @GetMapping("/{kullaniciId}")
    public List<Basvuru> getAllBasvuruByKullanici(@PathVariable int kullaniciId) {
        return basvuruService.getAllKullaniciBasvuru(kullaniciId);
        //Request param optional da olabilir
    }


}
