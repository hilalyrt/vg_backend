package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.services.SirketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
