package com.vgdemo.demo.repos;

import com.vgdemo.demo.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface KullaniciRepo extends JpaRepository<Kullanici,Long>, CrudRepository<Kullanici,Long> {
    //database e istek atmamızın metotlu hali

    Kullanici findByEmail(String email);

    Optional<Kullanici> findByemail(String email);


}
