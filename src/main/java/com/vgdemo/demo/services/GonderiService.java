package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Gonderi;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.repositories.GonderiRepo;
import com.vgdemo.demo.requests.GonderiCreateRequest;
import com.vgdemo.demo.requests.GonderiUpdateRequest;
import com.vgdemo.demo.services.KullanıcıService;
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

    Kullanici kullanici=kullanıcıService.getOneUserById(newPostRequest.getKullanici_id());
    if (kullanici==null)
              return null;
    Gonderi toSave=new Gonderi();
    toSave.setGonderiId(newPostRequest.getGonderi_id());
    toSave.setIcerik(newPostRequest.getIcerik());
    toSave.setFotografGonderi(newPostRequest.getFotografGonderi());
    toSave.setSayacYorum(newPostRequest.getSayac_yorum());
    toSave.setSayacBegeni(newPostRequest.getSayac_begeni());
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
        toUpdate.setIcerik(updateGonderiRequest.getIcerik());
       toUpdate.setFotografGonderi(updateGonderiRequest.getFotograf_gonderi());
       toUpdate.setSayacBegeni(updateGonderiRequest.getSayac_begeni());
       toUpdate.setSayacYorum(updateGonderiRequest.getSayac_yorum());
        gonderiRepo.save(toUpdate);
        return  toUpdate;
    }
return null;

    }

    public String getBase64(Long postId) {
        return gonderiRepo.findById(postId).get().getFotografGonderi();
    }

    public void increaseCommentsCount(Long id) {
        Gonderi gonderi = gonderiRepo.findById(id).orElse(null);
        if (gonderi != null) {
            gonderi.setSayacYorum(gonderi.getSayacYorum()+1);
            gonderiRepo.save(gonderi);
        }
    }


    public void increaseLikesCount(Long postId) {
        Gonderi gonderi = gonderiRepo.findById(postId).orElse(null);
        if (gonderi!=null) {
            gonderi.setSayacBegeni((gonderi.getSayacBegeni())+1);

            gonderiRepo.save(gonderi);
        }
    }
}
