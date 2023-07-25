CREATE TABLE GRUPLAR{
grup_id int,
uye_id int,
olusturan_id int,
grup_mevcut int,
sirket_hakkında varchar(1500),
olusturma_tarihi DATE

PRIMARY KEY grup_id
FOREIGN KEY uye_id REFERENCES KULLANICI(kullanici_id)
FOREIGN KEY olusturan_id REFERENCES KULLANICI(kullanici_id)

}