package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Sirket;
import com.vgdemo.demo.model.SirketLogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SirketLogoRepo extends JpaRepository<SirketLogo, Integer> {
}
