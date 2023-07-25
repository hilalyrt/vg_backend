package com.vgdemo.demo.repos;

import com.vgdemo.demo.model.Gonderi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GonderiRepo  extends JpaRepository<Gonderi,Long> {




    List<Gonderi> findByKullaniciKullaniciId(Long aLong);
}
