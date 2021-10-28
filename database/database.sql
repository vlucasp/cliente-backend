/***************************/
/*  CRIAÇÃO DA TB_CLIENTE  */
/***************************/
create table tb_cliente (
	id serial PRIMARY KEY,
	nome varchar(100) not null,
	cpf varchar(11) not null,
	cep varchar(8) not null,
	logradouro varchar(150) not null,
	bairro varchar(50) not null,
	cidade varchar(50) not null,
	uf varchar(2) not null,
	complemento varchar(500) null
);

/****************************/
/*  CRIAÇÃO DA TB_TELEFONE  */
/****************************/
create table tb_telefone (
	id serial PRIMARY KEY,
	id_cliente INT not null,
	FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id),
	telefone varchar(11) not null,
	tipo_telefone char(1) NOT NULL
);

/*************************/
/*  CRIAÇÃO DA TB_EMAIL  */
/*************************/
create table tb_email (
	id serial PRIMARY KEY,
	id_cliente INT not null,
	FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id),
	email varchar(100) not null
);


/*********************************/
/*  INSERTS EXEMPLOS PARA TESTE  */
/*********************************/
insert into tb_cliente (nome, cpf, cep, logradouro, bairro, cidade, uf, complemento) values
('Victor Pimentel', '04005094100', '71599000', 'Avenida do Parque Teste', 'Águas Claras', 'Brasília', 'DF', 'Próximo ao colégio TT');

insert into tb_cliente (nome, cpf, cep, logradouro, bairro, cidade, uf, complemento) values
('Lucas Alves', '95885959813', '71900599', 'Rua 26 de Teste', 'Taguatinga', 'Brasília', 'DF', null);

insert into tb_telefone (id_cliente, telefone, tipo_telefone) values
(1, '61988462222', 'C');

insert into tb_telefone (id_cliente, telefone, tipo_telefone) values
(1, '6133600060', 'R');

insert into tb_telefone (id_cliente, telefone, tipo_telefone) values
(2, '61999987777', 'C');

insert into tb_email (id_cliente, email) values
(1, 'email_de_teste_longo_do_outlook@outlook.com.br');

insert into tb_email (id_cliente, email) values
(1, 'email_do_gmail@gmail.com');

insert into tb_email (id_cliente, email) values
(2, 'lucas@gmail.com');