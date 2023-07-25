CREATE TABLE BASVURU{
    basvuru_id int,
    kullanici_id int,
    ilan_id,
    PRIMARY KEY(basvuru_id)
    FOREIGN KEY(kullanici_id) REFERENCES KULLANICI(kullanici_id)
    FOREIGN KEY(ilan_id) REFERENCES ILAN(ilan_id)
    }