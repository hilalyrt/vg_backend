package com.vgdemo.demo.requests;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BasvuruCreateRequest {
    @Id
    Long id;
    Long kullaniciId;
    int ilan_id;
}
