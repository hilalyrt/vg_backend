package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Begeni;
import com.vgdemo.demo.requests.BegeniCreateRequest;
import com.vgdemo.demo.services.BegeniService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/begeni")
public class BegeniController {
    private BegeniService begeniService;

    public BegeniController(BegeniService begeniService){
        this.begeniService=begeniService;
    }

    @GetMapping
    public List<Begeni> getAllBegeni(@RequestParam Optional<Long> kullaniciId, @RequestParam Optional<Long> gonderiId){
        return begeniService.getAllBegeniWithParam(kullaniciId,gonderiId);
    }

    @GetMapping("/{begeniId}")
    public Begeni getOneBegeni(@PathVariable Long begeniId){
        return begeniService.getOneBegeniById(begeniId);
    }

    @PostMapping
    public Begeni createOneBegeni(@RequestBody BegeniCreateRequest request){
        return begeniService.createBegeni(request);
    }
/*
    @PutMapping("/{begeniId}") // Add this method for updating a Begeni
    public Begeni updateOneBegeni(@PathVariable Long begeniId, @RequestBody BegeniCreateRequest request){
        return begeniService.updateBegeni(begeniId, request);
    }
*/

    @DeleteMapping("/{begeniId}")
    public void deleteOneBegeni(@PathVariable Long begeniId){
        begeniService.deleteOneBegeniById(begeniId);
    }


}
