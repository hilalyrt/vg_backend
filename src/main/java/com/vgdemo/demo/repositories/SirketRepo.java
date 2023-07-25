package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Sirket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SirketRepo extends JpaRepository <Sirket, Integer> {
}
