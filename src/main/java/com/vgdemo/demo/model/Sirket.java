package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SIRKET")
public class Sirket {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sirket_id;
    private String sirket_adi;
    private String adres;
    private String sirket_aciklamasi ;
    private String web_sitesi;
    @Column(length = 100000)
    private String logo;
}
