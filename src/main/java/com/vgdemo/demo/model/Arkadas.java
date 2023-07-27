package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "ARKADASLAR")
public class Arkadas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int baglanti_id;


    @ManyToOne
    @JoinColumn(name = "kullaniciId", referencedColumnName = "kullaniciId")
    private Kullanici kullanici2;

    @Temporal(TemporalType.DATE)
    private Date baglanti_tarihi;

    // other attributes, constructors, and getters/setters...
}