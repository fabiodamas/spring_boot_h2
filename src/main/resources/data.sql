drop table cliente IF EXISTS;

CREATE TABLE cliente (
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(200),
email VARCHAR(200),
PRIMARY KEY (id),
UNIQUE INDEX nome_index (nome ASC));

-- BANNER
insert into cliente (nome, email) values ('fabio', 'fabio.damas@gmail.com'); 
insert into cliente (nome, email) values  ('ludmila', 'ludmila@gmail.com.br'); 
insert into cliente (nome, email) values  ('victor', 'vitao@uol.com.br'); 

drop table produto IF EXISTS;

CREATE TABLE produto (
id INT NOT NULL AUTO_INCREMENT,
descricao VARCHAR(200),
marca  VARCHAR(200),
PRIMARY KEY (id),
UNIQUE INDEX descricao_index (descricao ASC));

-- BANNER
insert into produto (descricao, marca) values ('produto1', 'marcaA'); 
insert into produto (descricao, marca) values  ('produto2', 'marcaB'); 
insert into produto (descricao, marca) values  ('produto3', 'marcaC'); 
