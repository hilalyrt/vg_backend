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
    @JoinColumn(name="gonderiId")
    private Gonderi gonderi;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kullaniciId", referencedColumnName = "kullaniciId")
    private Kullanici kullanici;
}
