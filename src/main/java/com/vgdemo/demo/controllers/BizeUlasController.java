package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.BizeUlas;
import com.vgdemo.demo.repos.BizeUlasRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bizeulas")
public class BizeUlasController {
    private BizeUlasRepository bizeulasRepository;

    public BizeUlasController(BizeUlasRepository bizeulasRepository){
        this.bizeulasRepository = bizeulasRepository;

    }

    @PostMapping
    public BizeUlas createBizeUlas(@RequestBody BizeUlas yeniBizeUlas){
        return bizeulasRepository.save(yeniBizeUlas);
    }

    @GetMapping
    public List<BizeUlas> getALlBizeUlas() {
        return bizeulasRepository.findAll();

    }

    @PutMapping()
    public BizeUlas updateBizeulas(@RequestBody BizeUlas yeniBizeUlas){
        Optional<BizeUlas> bizeUlas = bizeulasRepository.findById(yeniBizeUlas.getId());
        BizeUlas foundbizeulas= bizeUlas.get();
        return foundbizeulas;
    }

}
