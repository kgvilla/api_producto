CREATE TABLE IF NOT EXISTS  client(
  id serial,
  name VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  description VARCHAR(45) NULL,
  precio VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );

  CREATE TABLE IF NOT EXISTS  product(
    id serial,
    description VARCHAR(45) NULL,
    details VARCHAR(45) NULL,
    precio VARCHAR(45) NULL,
    PRIMARY KEY (id)
    );