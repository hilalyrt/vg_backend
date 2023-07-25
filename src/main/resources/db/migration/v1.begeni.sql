CREATE TABLE BEGENI{
begeni_id int,
kullanici_id int,
gönderi_id int,
sayac int

PRIMARY KEY begeni_id
FOREIGN KEY kullanici_id REFERENCES KULLANICI(kullanici_id)
FOREIGN KEY gönderi_id REFERENCES GONDERI(gönderi_id)


}