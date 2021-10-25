CREATE TABLE IF NOT EXISTS  productos (
  id serial,
  description VARCHAR(45) NOT NULL,
  details VARCHAR(45) NULL,
  precio varchar(25),
  PRIMARY KEY (id)
  );