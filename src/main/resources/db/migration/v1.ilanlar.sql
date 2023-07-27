CREATE TABLE ILANLAR (
  ilan_id INT PRIMARY KEY,
  sirket_id INT,
  ilan_metni VARCHAR(500),
  yayin_tarihi DATE,
  goruldu_sayaci INT,
  ilan_turu VARCHAR(50),
  ilan_sinifi INT,
  ilan_basligi VARCHAR(100),
  basvuru_sayisi INT,
  bitis_tarihi DATE,
  FOREIGN KEY (sirket_id) REFERENCES SIRKET (sirket_id)
);