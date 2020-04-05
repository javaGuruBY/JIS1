--
--DROP TABLE IF EXISTS product;

--CREATE TABLE product (
--id BIGINT AUTO_INCREMENT  PRIMARY KEY,
--  category VARCHAR(255) NOT NULL,
--  description VARCHAR(255) DEFAULT NULL,
--  discount decimal(19,2) DEFAULT NULL,
--  name VARCHAR(255) DEFAULT NULL,
--  price decimal(19,2) DEFAULT NULL
--);

--CREATE TABLE product_category (
--id BIGINT AUTO_INCREMENT  PRIMARY KEY,
--  category_name VARCHAR(255) NOT NULL
--);

INSERT INTO product VALUES (1,'Meat products',NULL,11.00,'salce',11.20),
(2,'Technical goods',NULL,10.00,'Nokia',630.00),
(3,'Building products',NULL,11.00,'беседка',155.00),
(4,'Dairy products',NULL,55.00,'Milk',15.40),
(5,'Bakery products',NULL,55.00,'waffles',12.00),
(6,'Fruit',NULL,55.00,'Apple',6.30);


INSERT INTO category VALUES
(1, 'Fruit'),
(2, 'Vegetables'),
(3, 'Clothes'),
(4, 'Technical goods'),
(5, 'Building products'),
(6, 'Dairy products'),
(7, 'Meat products'),
(8, 'Sport and recreation'),
(9, 'Bakery products'),
(10, 'Products for children');