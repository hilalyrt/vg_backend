CREATE TABLE GRUPLAR{
grup_id int,
grup_adi varchar(150),
uye_id int,
olusturan_id int,
grup_mevcut int,
grup_hakkında varchar(1500),
olusturma_tarihi DATE

PRIMARY KEY grup_id
FOREIGN KEY uye_id REFERENCES KULLANICI(kullanici_id)
FOREIGN KEY olusturan_id REFERENCES KULLANICI(kullanici_id)

}