USE defaultdb;

CREATE TABLE tb_pessoa(
	cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL
);
INSERT tb_pessoa(nome, fone, email)
VALUES
('Ana', '77447744', 'ana@email.com');

SELECT * FROM tb_pessoa;