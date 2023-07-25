CREATE TABLE KULLANICI{
kullanici_id int,
tc_no varchar(11),
ad varchar(50),
soyad varchar(50),
e_mail varchar(50),
dogum_tarihi DATE,
fotograf varchar(150),
sirket_id int,
cinsiyet varchar(10),
uyruk varchar(20),
adres varchar(100),
baglanti_sayisi int,
takip_sayisi int,
hesap_turu varchar(50),
baglanti_id int,
PRIMARY KEY (kullanici_id)
FOREIGN KEY (sirket_id) REFERENCES SIRKET(sirket_id)
FOREIGN KEY (baglanti_id) REFERENCES BAGLANTI(baglanti_id)

}