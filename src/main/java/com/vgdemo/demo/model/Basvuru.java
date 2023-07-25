package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BASVURU")

public class Basvuru {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int basvuru_id;

    @ManyToOne
    @JoinColumn(name="kullanici_id")
    private Kullanici kullanici_basvuran;

    @ManyToOne
    @JoinColumn(name="ilan_id")
    private Ilanlar ilan;
}
