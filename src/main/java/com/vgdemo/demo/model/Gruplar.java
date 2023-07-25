package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GRUPLAR")
public class Gruplar {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int grup_id;

    @ManyToMany
    @JoinTable(
            name="grup_id",
            joinColumns=@JoinColumn(name="uye_id"),
            inverseJoinColumns = @JoinColumn(name = "grup_id")
    )

    @ManyToOne
    @JoinColumn(name= "olusturan_id")
    private Gruplar Grup_olusturan;


    private int grup_mevcut;
    private String sirket_hakkında;
    private String olusturulma_tarihi;

}
