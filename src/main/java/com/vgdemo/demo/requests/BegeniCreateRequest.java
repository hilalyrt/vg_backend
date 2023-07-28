package com.vgdemo.demo.requests;

import lombok.Data;

@Data
public class BegeniCreateRequest {
    int begeniId;
    Long kullaniciId;
    Long gonderiId;
}
