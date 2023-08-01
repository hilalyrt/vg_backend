package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GONDERI")

public class Gonderi {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int gonderiId;
    @ManyToOne
    @JoinColumn( name="kullaniciId")
    private Kullanici kullanici;

    private String icerik;
    private Date tarih;
    private int sayacBegeni;
    private int sayacYorum;
    @Column(length = 50000000)
    private  String fotografGonderi;


}
