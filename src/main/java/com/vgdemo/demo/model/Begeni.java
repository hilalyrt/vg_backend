package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BEGENI")

public class Begeni {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int begeni_id;

    @ManyToOne
    //@JoinColumn(name= "kullanici_id");
    private Kullanici kullanici;

    @ManyToOne
    //@JoinColumn(name="gonderi_id");
    private Gonderi gonderi;


    private int sayac;
}
