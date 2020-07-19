-- criacao do banco
CREATE DATABASE agenda;

-- direciona a conexao para o banco que acabamos de criar
USE agenda;

-- criacao da tabela de evento
CREATE TABLE evento (
  id INT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(45) NULL,
  PRIMARY KEY (id));
