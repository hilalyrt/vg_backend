package com.vgdemo.demo.service;

import com.vgdemo.demo.model.Gonderi;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repos.GonderiRepo;
import com.vgdemo.demo.requests.GonderiCreateRequest;
import com.vgdemo.demo.requests.GonderiUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GonderiService {
   private GonderiRepo gonderiRepo;
   private KullanıcıService kullanıcıService;


    public GonderiService(GonderiRepo gonderiRepo,KullanıcıService kullanıcıService) {
        this.gonderiRepo = gonderiRepo;
        this.kullanıcıService=kullanıcıService;
    }

    public List<Gonderi> getAllGonderi(Optional<Long> userId) {
        if(userId.isPresent())
            return gonderiRepo.findByKullaniciKullaniciId(userId.get());
                    return gonderiRepo.findAll();
    }

    public Gonderi getOneGonderiById(Long gonderiId) {

        return gonderiRepo.findById(gonderiId).orElse(null);
    }




    public Gonderi createOneGonderi(GonderiCreateRequest newPostRequest) {

Kullanici kullanici=kullanıcıService.getOneUser(newPostRequest.getKullaniciId());
if (kullanici==null)
    return null;
Gonderi toSave=new Gonderi();
toSave.setGonderi_id(newPostRequest.getGonderi_id());
toSave.setIcerik(newPostRequest.getIcerik());
toSave.setMetin(newPostRequest.getMetin());
toSave.setTarih(newPostRequest.getTarih());
toSave.setKullanici(kullanici);
       return gonderiRepo.save(toSave);
    }

    public void deleteOneGonderiById(Long postId) {
        gonderiRepo.deleteById(postId);
    }

    public Gonderi updateOneGonderiById(Long postId, GonderiUpdateRequest updateGonderiRequest) {

    Optional<Gonderi> gonderi=gonderiRepo.findById(postId);
    if(gonderi.isPresent()){
        Gonderi toUpdate=gonderi.get();
        toUpdate.setMetin(updateGonderiRequest.getMetin());
        toUpdate.setIcerik(updateGonderiRequest.getIcerik());
        gonderiRepo.save(toUpdate);
        return  toUpdate;
    }
return null;

    }
}
