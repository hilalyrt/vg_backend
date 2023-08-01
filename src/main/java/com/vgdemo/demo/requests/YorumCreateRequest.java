package com.vgdemo.demo.requests;

import lombok.Data;

@Data
public class YorumCreateRequest {

    int yorum_id;
    String yorum_metni;
    Long kullaniciId;
    Long gonderiId;
    String yorum_tarihi;
    String email;
}
