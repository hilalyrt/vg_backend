package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "YORUM")

public class Yorum {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int yorum_id;

    @ManyToOne
    @JoinColumn(name="kullanici_id")
    private Kullanici kullanici;


    @ManyToOne
    @JoinColumn(name="gonderi_id")
    private Gonderi gonderi;

    private String yorum_metni;
    private String yorum_tarihi;
    private int sayac;
}
