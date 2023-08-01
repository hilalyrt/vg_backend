package com.vgdemo.demo.requests;

import lombok.Data;

@Data
public class GonderiUpdateRequest {


    private String icerik;
    private String metin;
    private int sayacBegeni;
    private int sayacYorum;
    String fotograf_gonderi;
    int sayac_begeni;
    int sayac_yorum;


    // Getter and Setter for sayacBegeni
    public int getSayacBegeni() {
        return sayacBegeni;
    }

    public void setSayacBegeni(int sayacBegeni) {
        this.sayacBegeni = sayacBegeni;
    }

    // Getter and Setter for sayacYorum
    public int getSayacYorum() {
        return sayacYorum;
    }

    public void setSayacYorum(int sayacYorum) {
        this.sayacYorum = sayacYorum;
    }
}

