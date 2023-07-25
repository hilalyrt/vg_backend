package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Etkinlik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtkinlikRepo extends JpaRepository<Etkinlik,Integer> {
}
