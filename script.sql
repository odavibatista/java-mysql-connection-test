CREATE DATABASE crud_pessoas;
USE crud_pessoas;

 CREATE TABLE tb_pessoas(
 	cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
     nome VARCHAR(200) NOT NULL,
     fone VARCHAR(200) NULL,
     email VARCHAR(200) NOT NULL,
     ativo TINYINT NOT NULL DEFAULT 1
);

INSERT INTO tb_pessoas (nome, fone, email, ativo) VALUES ('Davi', '11959872118', 'davi@email.com');

SELECT * FROM tb_pessoas;

