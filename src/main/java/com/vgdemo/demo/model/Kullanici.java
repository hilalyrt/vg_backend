package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "KULLANICI")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kullaniciId;
    private String ad;
    private String soyad;
    private String email;
    private String sifre;
    private String dogum_tarihi;
    private String fotograf;

    @ManyToOne
    @JoinColumn(name = "sirket_id")
    private Sirket sirket;





    private String cinsiyet;
    private String adres;



}