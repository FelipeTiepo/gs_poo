CREATE TABLE USUARIO (
id_usuario int PRIMARY KEY NOT NULL, 
id_dados int NOT NULL,
id_registro_consulta int NOT NULL,
nome VARCHAR2(30) NOT NULL,
email VARCHAR2(30) NOT NULL,
senha VARCHAR2(15) NOT NULL,
tipo_conta int NOT NULL
);

CREATE TABLE TECNOLOGIAS (
id_tecnologia int PRIMARY KEY NOT NULL,
exame_nome VARCHAR2(40) NOT NULL,
exame_descricao VARCHAR2(80) NOT NULL
);

CREATE TABLE DADOS_BIOMETRICOS (
id_dados int PRIMARY KEY NOT NULL,
idade int,
altura int,
peso int, 
tipo_sanguineo VARCHAR2(5),
cpf int,
convenio_medico VARCHAR2(30),
pressao_maior int,
pressao_menor int,
genero VARCHAR2(30)
);

CREATE TABLE AVALIACAO (
id_avaliacao int PRIMARY KEY NOT NULL,
id_tecnologia int NOT NULL,
nota_usuario int,
feedback_usuario VARCHAR2(300)
);

CREATE TABLE REGISTRO_CONSULTA (
id_registro_consulta int PRIMARY KEY NOT NULL,
id_tecnologia int NOT NULL, 
data_registro_consulta DATE NOT NULL,
horario VARCHAR2(20) NOT NULL
);

ALTER TABLE USUARIO ADD FOREIGN KEY (id_dados) REFERENCES dados_biometricos(id_dados);

ALTER TABLE USUARIO ADD FOREIGN KEY (id_registro_consulta) REFERENCES REGISTRO_CONSULTA(id_registro_consulta);

ALTER TABLE AVALIACAO ADD FOREIGN KEY (id_tecnologia) REFERENCES TECNOLOGIAS(id_tecnologia);

ALTER TABLE REGISTRO_CONSULTA ADD FOREIGN KEY (id_tecnologia) REFERENCES TECNOLOGIAS(id_tecnologia);


