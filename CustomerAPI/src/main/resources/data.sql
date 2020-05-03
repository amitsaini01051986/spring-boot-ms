DROP TABLE IF EXISTS TBL_CUSTOMER;
  
CREATE TABLE TBL_CUSTOMER (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email_address VARCHAR(250) DEFAULT NULL
);

INSERT INTO TBL_CUSTOMER (name, email_address) VALUES
  ('Lokesh', 'abc@gmail.com'),
  ('Deja', 'xyz@email.com'),
  ('Caption', 'cap@marvel.com');