package com.vgdemo.demo.requests;

import com.vgdemo.demo.model.Sirket;
import lombok.Data;

@Data
public class KullaniciUpdateRequest {

    String ad;
    String soyad;
    String email;
    String adres;
    String fotograf;
    String dogum_tarihi;
    String cinsiyet;


}
