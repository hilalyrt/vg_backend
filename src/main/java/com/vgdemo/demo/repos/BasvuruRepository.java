package com.vgdemo.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vgdemo.demo.model.Basvuru;

public interface BasvuruRepository extends JpaRepository<Basvuru, Integer> {
}
