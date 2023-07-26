package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "BLOG")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  @Column(length = 100000)
    private String resim;
    private String baslik;
    private String icerik;


}
