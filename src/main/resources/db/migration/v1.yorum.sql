CREATE TABLE YORUM{
    yorum_id int,
    kullanici_id int,
    gonderi_id int,
    yorum_metni varchar(200),
    yorum_tarihi date,
 ,
    PRIMARY KEY(yorum_id)
    FOREIGN KEY(kullanici_id) REFERENCES KULLANICI(kullanici_id)
    FOREIGN KEY(gonderi_id) REFERENCES GONDERI(gonderi_id)
    }