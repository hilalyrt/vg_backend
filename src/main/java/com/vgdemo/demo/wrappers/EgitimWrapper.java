package com.vgdemo.demo.wrappers;

import com.vgdemo.demo.model.Kullanici;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class EgitimWrapper {

    private int egitim_id;
    private  String okul;
    private double ortalama;
    private String sınıf;
    private String fakulte ;
    private String bolum;


    private String hakkinda;

    private Long kullanici_id;

    public int getEgitim_id() {
        return egitim_id;
    }

    public void setEgitim_id(int egitim_id) {
        this.egitim_id = egitim_id;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        this.hakkinda = hakkinda;
    }

    public Long getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(Long kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public EgitimWrapper( String okul, double ortalama, String sınıf, String fakulte, String bolum, String hakkinda, Long kullanici_id) {

        this.okul = okul;
        this.ortalama = ortalama;
        this.sınıf = sınıf;
        this.fakulte = fakulte;
        this.bolum = bolum;
        this.hakkinda = hakkinda;
        this.kullanici_id = kullanici_id;
    }
}
