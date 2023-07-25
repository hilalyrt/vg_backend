CREATE TABLE PAYLAS{
    paylasma_id int,
    gonderi_id int,
    kullanici_id int,
    PRIMARY KEY(paylasma_id)
    FOREIGN KEY(gonderi_id) REFERENCES GONDERI(gonderi_id)
    FOREIGN KEY(kullanici_id) REFERENCES KULLANICI(kullanici_id)
    }