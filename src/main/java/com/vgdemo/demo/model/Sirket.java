package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "SIRKET")
public class Sirket {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sirket_id;
    private String sirket_adi;
    private String adres;
    private String sirket_aciklamasi ;
    private String web_sitesi;
    @Column(length = 50000000)
    private String logo;


}
