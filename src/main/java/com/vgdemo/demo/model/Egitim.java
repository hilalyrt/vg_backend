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
        private String sınıf;
        private String fakulte ;
        private String bolum;

        @Column (length = 500)
        private String hakkinda;

        @ManyToOne
        @JoinColumn(name = "kullaniciId")
        private Kullanici kullanici;


}
