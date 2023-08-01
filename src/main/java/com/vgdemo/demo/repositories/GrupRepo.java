package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Gruplar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrupRepo extends JpaRepository<Gruplar, Integer> {

    List<Gruplar> findByUyeler_kullaniciId(Long kullaniciId);
}
