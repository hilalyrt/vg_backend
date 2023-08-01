package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repositories.KullaniciRepo;
import com.vgdemo.demo.requests.KullaniciUpdateRequest;
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

    public Kullanici getOneUserById(Long userId) {
        return  kullaniciRepo.findById(userId).orElse(null);
    }

    public Kullanici getOneUserByEmail(String email){
        return kullaniciRepo.findByEmail(email);
    }



    public Kullanici updateOneUserEmail(String email, KullaniciUpdateRequest newUser) {
        Optional<Kullanici> user = kullaniciRepo.findByemail(email);
        if(user.isPresent()){
            Kullanici foundUser= user.get();
            foundUser.setAd(newUser.getAd());
            foundUser.setSoyad(newUser.getSoyad());
            foundUser.setEmail(newUser.getEmail());
            foundUser.setDogum_tarihi(newUser.getDogum_tarihi());
            foundUser.setCinsiyet(newUser.getCinsiyet());
            foundUser.setAdres(newUser.getAdres());
            foundUser.setFotograf(newUser.getFotograf());
            kullaniciRepo.save(foundUser);
            return  foundUser;

        }else{
            return null;
        }
    }

    public void deleteById(Long userId) {
        kullaniciRepo.deleteById(userId  );
    }


    public Kullanici register(Kullanici kullanici){
        return kullaniciRepo.save(kullanici);
    }

    public boolean login(String email,String sifre){
        Kullanici kullanici=kullaniciRepo.findByEmail(email);
        if(kullanici!=null &&kullanici.getSifre().equals(sifre)){
            return true;
        }
        return false;
    }


    public String getBase64(Long postId) {
        return kullaniciRepo.findById(postId).get().getFotograf();
    }


}
