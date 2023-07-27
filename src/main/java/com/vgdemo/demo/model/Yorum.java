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
    private int yorumId;

    @ManyToOne
    @JoinColumn(name="kullaniciId")
    private Kullanici kullanici;


    @ManyToOne
    @JoinColumn(name="gonderiId")
    private Gonderi gonderi;

    private String yorum_metni;
    private String yorum_tarihi;
}
