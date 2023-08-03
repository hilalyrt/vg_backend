package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Gruplar;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.services.KullanıcıService;
import com.vgdemo.demo.services.GruplarService;
import com.vgdemo.demo.wrappers.GrupOlusturWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gruplar")
public class GrupController {

    private GruplarService gruplarService;
    private KullanıcıService kullanıcıService;

    public GrupController(GruplarService gruplarService, KullanıcıService kullanıcıService) {
        this.gruplarService = gruplarService;
        this.kullanıcıService = kullanıcıService;
    }

    @GetMapping
    public List<Gruplar> getAllGruplar() {
        return gruplarService.getAll();
    }

    @GetMapping("/{kullaniciId}")
    public List<Gruplar> getGrupByKullaniciId(@PathVariable Long kullaniciId) {
        return gruplarService.getGrupByKullaniciId(kullaniciId);
    }

    @GetMapping("/uyeler/{grupId}")
    public List<Integer> getAllUye(@PathVariable Integer grupId){
        return gruplarService.getAllUye(grupId);
    }

    @PostMapping("{grupId}/uye-ekle/{kullaniciId}")
    public Gruplar addUserToGroup(@PathVariable int grupId, @PathVariable Long kullaniciId) {
        return gruplarService.uyeEkle(grupId, kullaniciId);
    }

    @PostMapping("grup-olustur/{olusturanId}")
        public Gruplar grupOlustur(@PathVariable Long olusturanId, @RequestBody GrupOlusturWrapper grupWrapper){
        return gruplarService.grupOlustur(olusturanId, grupWrapper);
        }

}
