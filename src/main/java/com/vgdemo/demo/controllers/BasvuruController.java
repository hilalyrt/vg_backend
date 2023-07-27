package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Basvuru;
import com.vgdemo.demo.repos.BasvuruRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basvuru")

public class BasvuruController {
    private BasvuruRepository basvuruRepository;

    public BasvuruController(BasvuruRepository basvuruRepository){
        this.basvuruRepository = basvuruRepository;

    }

    @PostMapping
    public Basvuru createBasvuru(@RequestBody Basvuru yeniBasvuru){
        return basvuruRepository.save(yeniBasvuru);
    }
}
