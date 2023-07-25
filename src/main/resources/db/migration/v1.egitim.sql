CREATE TABLE EGITIM (
  egitim_id INT,
  okul VARCHAR(50),
  fakulte VARCHAR(50),
  bolum VARCHAR(50),
  egitim_turu VARCHAR(50),
  baslama_tarihi DATE,
  bitis_tarihi DATE,
  hakkinda VARCHAR(500),
  kullanici_id INT,
  PRIMARY KEY (egitim_id),
  FOREIGN KEY (sirket_id) REFERENCES KULLANICI(kullanici_id)
);