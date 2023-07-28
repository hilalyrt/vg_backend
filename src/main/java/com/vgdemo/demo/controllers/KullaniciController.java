package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repositories.KullaniciRepo;
import com.vgdemo.demo.services.KullanıcıService;
import com.vgdemo.demo.services.KullanıcıService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class KullaniciController {

    private KullanıcıService kullanıcıService;

    public KullaniciController(KullanıcıService kullanıcıService) {
        this.kullanıcıService = kullanıcıService;
    }

    @GetMapping
    public List<Kullanici> getAllUsers() {
        return kullanıcıService.getAllUsers();
    }
    @PostMapping
    public Kullanici createUser(@RequestBody Kullanici newUser) {
        return kullanıcıService.saveOneUser(newUser);
    }

    @GetMapping("/{userId}")
    public Kullanici getOneUser(@PathVariable Long userId) {
        //custom exception
        return kullanıcıService.getOneUserById(userId);
    }

    @PutMapping("/{userId}")
    public Kullanici updateOneUser(@PathVariable Long userId, @RequestBody Kullanici newUser) {

        return kullanıcıService.updateOneUser(userId, newUser);


    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId) {
        kullanıcıService.deleteById(userId);
    }

    @PostMapping("/register")
    public Kullanici registerKullanici(@RequestBody Kullanici kullanici) {

        return kullanıcıService.register(kullanici);
    }





    @GetMapping("/login")
    public boolean loginKullanici(@RequestParam String email, @RequestParam String sifre) {
        return kullanıcıService.login(email, sifre);

    }
}
