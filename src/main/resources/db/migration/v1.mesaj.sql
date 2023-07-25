CREATE TABLE MESAJ{
    mesaj_id int,
    gonderen_id int,
    alici_id int,
    mesaj varchar(200),
    PRIMARY KEY(mesaj_id)
    FOREIGN KEY(gonderen_id) REFERENCES KULLANICI(kullanici_id)
    FOREIGN KEY(alici_id) REFERENCES KULLANICI(kullanici_id)
    }