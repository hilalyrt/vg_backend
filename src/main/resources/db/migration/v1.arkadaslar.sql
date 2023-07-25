CREATE TABLE ARKADASLAR {

baglanti_id int,

kullanici_id2 int,
baglanti_tarihi DATE,

PRIMARY KEY (baglanti_id)

FOREIGN KEY (kullanici_id2) REFERENCES KULLANICI(kullanici_id)
}