CREATE TABLE ILANLAR{
ilan_id int,
sirket_id int;
ilan_metni varchar(500),
yayin_tarihi date,
goruldu_sayacı int,
ilan_turu varchar(50),
ilan_sinifi int,
ilan_basligi varchar(100),
basvuru_sayisi int,
bitis_tarihi DATE,
PRIMARY KEY (ilan_id)
FOREIGN KEY (sirket_id) REFERENCES SIRKET(sirket_id)
}