package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Gonderi;
import com.vgdemo.demo.model.Kullanici;
import com.vgdemo.demo.model.Yorum;
import com.vgdemo.demo.repositories.YorumRepo;
import com.vgdemo.demo.requests.YorumCreateRequest;
import com.vgdemo.demo.requests.YorumUpdateRequest;
import com.vgdemo.demo.services.GonderiService;
import com.vgdemo.demo.services.KullanıcıService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YorumService {


    private YorumRepo yorumRepo;
    private KullanıcıService kullanıcıService;
    private GonderiService gonderiService;


    public YorumService(YorumRepo yorumRepo, KullanıcıService kullanıcıService, GonderiService gonderiService) {
        this.yorumRepo = yorumRepo;
        this.kullanıcıService = kullanıcıService;
        this.gonderiService = gonderiService;
    }



    public List<Yorum> getAllYorumWithParam(Optional<Long> userId, Optional<Long> postId) {
        if(userId.isPresent()&&postId.isPresent()){
            return yorumRepo.findByKullaniciKullaniciIdAndYorumId(userId.get(),postId.get());
        }
        else if(userId.isPresent()){
            return yorumRepo.findByKullaniciKullaniciId(userId.get());
        }else if(postId.isPresent()){
            return yorumRepo.findByGonderiGonderiId(postId.get());
        }else{
            return yorumRepo.findAll();
        }

    }

    public Yorum getOneYorumById(Long commentId) {

        return yorumRepo.findById(commentId).orElse(null);
    }

    public Yorum createOneYorumById(YorumCreateRequest request) {
        Kullanici kullanici=kullanıcıService.getOneUserById(request.getKullaniciId());
        Gonderi gonderi=gonderiService.getOneGonderiById(request.getGonderiId());
        if(kullanici !=null && gonderi!=null){
            Yorum yorumToSave = new Yorum();
            yorumToSave.setYorumId(request.getYorum_id());
            yorumToSave.setKullanici(kullanici);
            yorumToSave.setGonderi(gonderi);
            yorumToSave.setYorum_metni(request.getYorum_metni());
            return yorumRepo.save(yorumToSave);
        }else
            return null;
    }

    public Yorum updateOneYorumById(Long commentId, YorumUpdateRequest request) {

        Optional<Yorum> yorum=yorumRepo.findById(commentId);
        if(yorum.isPresent()){
            Yorum yorumToUpdate=yorum.get();
            yorumToUpdate.setYorum_metni(request.getYorum_metni());
            return yorumRepo.save(yorumToUpdate);
        }else
            return null;
    }

    public void deleteOneYorumById(Long commentId) {
        yorumRepo.deleteById(commentId);
    }
}
