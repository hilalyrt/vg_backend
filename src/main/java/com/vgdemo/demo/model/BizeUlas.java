package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "BIZEULAS")

public class BizeUlas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ad;
    private String soyad;
    private String e_mail;
    private String baslik;
    private String icerik;
}
