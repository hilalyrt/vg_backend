package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.requests.KullaniciUpdateRequest;
import com.vgdemo.demo.services.KullanıcıService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/userId/{userId}")
    public Kullanici getOneUser(@PathVariable Long userId) {
        //custom exception
        return kullanıcıService.getOneUserById(userId);
    }


    @GetMapping("/email/{email}")
    public Kullanici getOneUserEmail(@PathVariable String email) {
        return kullanıcıService.getOneUserByEmail(email);
    }


    @PutMapping("/email/{email}")
    public ResponseEntity<Void> updateOneUserEmail(@PathVariable String email, @RequestBody KullaniciUpdateRequest newUser) {
        Kullanici user = kullanıcıService.updateOneUserEmail(email, newUser);
        if (user != null) return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    }


    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId) {
        kullanıcıService.deleteById(userId);
    }

    @PostMapping("/register")
    public Kullanici registerKullanici(@RequestBody Kullanici kullanici) {

        return kullanıcıService.register(kullanici);
    }


    @PostMapping("/login")
    public boolean loginKullanici(@RequestBody Kullanici kullanici) {
        return kullanıcıService.login(kullanici.getEmail(), kullanici.getSifre());

    }
}
