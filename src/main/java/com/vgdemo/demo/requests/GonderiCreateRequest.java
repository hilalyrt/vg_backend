package com.vgdemo.demo.requests;

import lombok.Data;

@Data
public class GonderiCreateRequest {


     int gonderi_id;
     String metin;
     String icerik;
     String tarih;
    Long kullaniciId;

}
