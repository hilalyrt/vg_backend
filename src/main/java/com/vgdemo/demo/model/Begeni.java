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
<<<<<<< Updated upstream
    @JoinColumn(name = "kullaniciId")
    private Kullanici kullanici;

    @ManyToOne
    @JoinColumn(name = "gonderiId")
    private Gonderi gonderi;


=======
    @JoinColumn(name = "kullaniciId");
    private Kullanici kullanici;

    @ManyToOne
    //@JoinColumn(name="gonderiId");
    private Gonderi gonderi;



>>>>>>> Stashed changes
}
