package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GONDERI")

public class Gonderi {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int gonderi_id;

    @ManyToOne
    @JoinColumn( name="kullanici_id")
    private Kullanici kullanici;

    private String metin;
    private String icerik;
    private String tarih;

}
