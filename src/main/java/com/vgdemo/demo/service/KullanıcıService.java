package com.vgdemo.demo.service;

import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repos.KullaniciRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullanıcıService {

    KullaniciRepo kullaniciRepo;

    public KullanıcıService(KullaniciRepo kullaniciRepo) {
        this.kullaniciRepo = kullaniciRepo;
    }


    public List<Kullanici> getAllUsers() {
        return kullaniciRepo.findAll();
    }

    public Kullanici saveOneUser(Kullanici newUser){
        return kullaniciRepo.save(newUser);
    }

    public Kullanici getOneUser(Long userId) {

        return  kullaniciRepo.findById(userId).orElse(null);
    }

    public Kullanici updateOneUser(Long userId, Kullanici newUser) {
        Optional<Kullanici> user = kullaniciRepo.findById(userId);
        if(user.isPresent()){
            Kullanici foundUser= user.get();
            foundUser.setAd(newUser.getAd());
            kullaniciRepo.save(foundUser);
            return  foundUser;

        }else{
            return null;
        }
    }

    public void deleteById(Long userId) {
        kullaniciRepo.deleteById(userId  );
    }
}
