CREATE DATABASE db_contatos;

CREATE TABLE contatos (
	id SERIAL,
	nome VARCHAR (128),
	email_principal VARCHAR (128),
	telefone VARCHAR (32),
	PRIMARY KEY (id)
);
