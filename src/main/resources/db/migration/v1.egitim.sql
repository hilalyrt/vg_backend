CREATE TABLE EGITIM (
  egitim_id INT,
  okul VARCHAR(50),
  fakulte VARCHAR(50),
  bolum VARCHAR(50),
  hakkinda VARCHAR(500),
  kullanici_id INT,
  sınıf varchar(20),
  PRIMARY KEY (egitim_id),
  FOREIGN KEY (sirket_id) REFERENCES KULLANICI(kullanici_id)
);