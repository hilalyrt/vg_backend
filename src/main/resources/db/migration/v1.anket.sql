CREATE TABLE ANKET{
    anket_id int,
    kullanici_id int,
    sorular varchar(100),
    PRIMARY KEY(anket_id)
    FOREIGN KEY(kullanici_id) REFERENCES KULLANICI(kullanici_id)
    }
