package com.vgdemo.demo.wrappers;

public class GrupOlusturWrapper {
    private String grupAdi;
    private String grupAcıklamasi;
    private String olusturulma_tarihi;

    public GrupOlusturWrapper(String grupAdi, String grupAcıklamasi, String olusturulma_tarihi) {
        this.grupAdi = grupAdi;
        this.grupAcıklamasi = grupAcıklamasi;
        this.olusturulma_tarihi = olusturulma_tarihi;
    }

    public String getGrupAdi() {
        return grupAdi;
    }

    public void setGrupAdi(String grupAdi) {
        this.grupAdi = grupAdi;
    }

    public String getGrupAcıklamasi() {
        return grupAcıklamasi;
    }

    public void setGrupAcıklamasi(String grupAcıklamasi) {
        this.grupAcıklamasi = grupAcıklamasi;
    }

    public String getOlusturulma_tarihi() {
        return olusturulma_tarihi;
    }

    public void setOlusturulma_tarihi(String olusturulma_tarihi) {
        this.olusturulma_tarihi = olusturulma_tarihi;
    }
}
