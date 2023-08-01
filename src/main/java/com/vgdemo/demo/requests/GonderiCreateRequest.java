package com.vgdemo.demo.requests;

import lombok.Data;

@Data
public class GonderiCreateRequest {


    int gonderiId;
    String metin;

    int gonderi_id;

    String icerik;
    Long kullanici_id;
    String fotografGonderi;
    int sayac_begeni = 0;
    int sayac_yorum = 0;


}
