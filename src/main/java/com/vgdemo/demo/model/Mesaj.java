package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MESAJ")

public class Mesaj {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int mesaj_id;

    @OneToOne
    @JoinColumn(name = "gonderen_id", referencedColumnName = "kullaniciId")
    private Kullanici kullanici;

    @OneToOne
    @JoinColumn(name = "alici_id", referencedColumnName = "kullaniciId")
    private Kullanici kullanici2;

    private String metin;
}
