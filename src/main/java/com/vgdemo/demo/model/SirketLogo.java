package com.vgdemo.demo.model;

import jakarta.persistence.*;

@Entity
public class SirketLogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    private Sirket sirket;

    @Lob
    @Column(length = 50000000)
    private String base64;

    private String contentType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sirket getSirket() {
        return sirket;
    }

    public void setSirket(Sirket sirket) {
        this.sirket = sirket;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
