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




    @OneToMany(mappedBy = "kullanici2")
    private List<Arkadas> arkadaslar2;

    private String cinsiyet;
    private String uyruk;
    private String adres;
    private int baglanti_sayisi;
    private int takip_sayisi;
}