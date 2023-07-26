package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ILANLAR")
public class Ilanlar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ilan_id;

    @ManyToOne
    @JoinColumn(name = "sirket_id")
    private Sirket sirket;

    private String ilan_metni;
    private String yayin_tarihi;
    private int goruldu_sayaci;
    private String ilan_turu;
    private String ilan_sinifi;
    private String ilan_baslıgı;
    private int basvuru_sayisi;
    private String bitis_tarihi;
    private String resim;
}
