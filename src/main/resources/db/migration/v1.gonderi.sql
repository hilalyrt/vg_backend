CREATE TABLE GONDERI{
gönderi_id int,
kullanici_id int,
metin varchar(1500),
icerik varchar(1500),
tarih DATE

PRIMARY KEY (gönderi_id)
FOREIGN KEY kullanici_id REFERENCES KULLANICI(kullanici_id)


}