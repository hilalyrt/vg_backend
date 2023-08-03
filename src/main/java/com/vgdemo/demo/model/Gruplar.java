package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GRUPLAR")
public class Gruplar {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int grup_id;

    private String grupAdi;

    @ManyToMany
    @JoinTable(
            name = "GRUPLAR_UYELER",
            joinColumns = @JoinColumn(name = "grup_id"),
            inverseJoinColumns = @JoinColumn(name = "kullanici_id")
    )
    private List<Kullanici> uyeler;

    @ManyToOne
    @JoinColumn(name= "olusturan_id")
    private Kullanici grupOlusturan;


    private int grup_mevcut;
    private String grup_hakkında;
    private String olusturulma_tarihi;


    public void grubaKullaniciEkle(Kullanici kullanici) {
        uyeler.add(kullanici);
    }
}
