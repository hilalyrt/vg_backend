package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Egitim;
import com.vgdemo.demo.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EgitimRepo extends JpaRepository<Egitim,Integer> {
    Egitim getEgitimByKullanici(Kullanici kullanici);
}
