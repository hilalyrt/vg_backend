package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYLAS")

public class Paylas {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int paylasma_id;

    @ManyToOne
    @JoinColumn(name="gonderi_id")
    private Gonderi gonderi;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kullanici_id", referencedColumnName = "kullanici_id")
    private Kullanici kullanici;
}
