package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ANKET")

public class Anket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int anket_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kullaniciId", referencedColumnName = "kullaniciId")
    private Kullanici kullanici;
    private String sorular;
}
