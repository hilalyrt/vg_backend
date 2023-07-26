package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ETKINLIK")
public class Etkinlik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String baslik;
    private String icerik;
    @Column(length = 50000000)
    private String resim;
}

