package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "EGITIM")
public class Egitim {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int egitim_id;
        private  String okul;
        private double ortalama;
        private String fakulte ;
        private String bolum;
        private String egitim_turu;
        private String baslama_tarihi;
        private String bitis_tarihi;
        private String hakkinda;

        @ManyToOne
        @JoinColumn(name = "kullanici_id")
        private Kullanici kullanici;

        private String resim;

}
