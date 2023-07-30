package com.vgdemo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vgdemo.demo.model.Basvuru;


import java.util.List;

public interface BasvuruRepository extends JpaRepository<Basvuru, Integer> {

    List<Basvuru> findByKullaniciKullaniciId(int kullaniciId);
}

