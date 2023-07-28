package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Begeni;
import com.vgdemo.demo.model.Gonderi;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repositories.BegeniRepo;
import com.vgdemo.demo.requests.BegeniCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BegeniService {

    private BegeniRepo begeniRepo;
    @Autowired
    private KullanıcıService kullanıcıService;

    private GonderiService gonderiService;

    public BegeniService(BegeniRepo begeniRepo,KullanıcıService kullanıcıService,GonderiService gonderiService){
        this.begeniRepo=begeniRepo;
        this.kullanıcıService=kullanıcıService;
        this.gonderiService=gonderiService;
    }

    public List<Begeni> getAllBegeniWithParam(Optional<Long> userId, Optional<Long> postId) {
        if(userId.isPresent()&&postId.isPresent()){
            return begeniRepo.findByKullaniciKullaniciIdAndGonderiGonderiId(userId.get(),postId.get());
        }
        else if(userId.isPresent()){
            return begeniRepo.findByKullaniciKullaniciId(userId.get());
        }else if(postId.isPresent()){
            return begeniRepo.findByGonderiGonderiId(postId.get());
        }else{
            return begeniRepo.findAll();
        }

    }
    public Begeni createBegeni(BegeniCreateRequest request) {
      Kullanici kullanici=kullanıcıService.getOneUserById(request.getKullaniciId());
      Gonderi gonderi=gonderiService.getOneGonderiById(request.getGonderiId());
        if(kullanici !=null && gonderi!=null){
            Begeni begeniToSave= new Begeni();
            begeniToSave.setBegeniId(request.getBegeniId());
            begeniToSave.setKullanici(kullanici);
            begeniToSave.setGonderi(gonderi);
            return begeniRepo.save(begeniToSave);
        }else
            return null;
    }


    public void deleteOneBegeniById(Long begeniId){
        begeniRepo.deleteById(begeniId);
    }

    public Begeni getOneBegeniById(Long begeniId) {
        return begeniRepo.findById(begeniId).orElse(null);
    }
/*
    public Begeni updateBegeni(Long begeniId, BegeniCreateRequest request) {
        Optional<Begeni> begeni = begeniRepo.findById(begeniId);

        if (begeni.isPresent()) {
            Begeni begeniToUpdate=begeni.get();
            begeniToUpdate
        }
    }
*/
}
