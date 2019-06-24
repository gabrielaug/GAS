/*
	GESTÃO DE ASSISTENCIA SOCIAL - GAS
		SCRIPT DO BANCO DE DADOS.
		VERSÃO: V1.00

*/
CREATE DATABASE GAS;

USE GAS;

CREATE TABLE Voluntario ( 	Login VARCHAR(50) PRIMARY KEY,
							Senha VARCHAR(50) DEFAULT '81dc9bdb52d04dc20036dbd8313ed055',  -- Senha Padrão: 1234
							Nome  VARCHAR(100) NOT NULL, 
							CPF VARCHAR(14),
							Profissao VARCHAR(100),
							Endereco VARCHAR(50),
							Complemento VARCHAR(100),
							Numero VARCHAR(10), 
							Bairro VARCHAR(30),
							Cidade VARCHAR (30),
							UF CHAR(2),
							CEP VARCHAR(10),
							Telefone VARCHAR(13),
							Celular VARCHAR(14),
							Dt_Nascumento DATE,
							Status CHAR(1) DEFAULT 'A', -- A = Usuário Ativo / I = Usuário Inativo.
							Dt_Cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
							StatusSenha INT DEFAULT 0  -- 0 = Primeiro Login para Reset de Senha / 1 = Senha já foi alterada
						);


CREATE TABLE Morador ( 		Cod_Morador INT PRIMARY KEY AUTO_INCREMENT,
							Nome  VARCHAR(100) NOT NULL, 
							CPF VARCHAR(14),
							RG VARCHAR(10),
							ORG_Emissor VARCHAR(6),
							UF_Emissor CHAR(2),
							Profissao VARCHAR(100),
							Telefone VARCHAR(13),
							Celular VARCHAR(14),
							Renda DECIMAL(7,2) DEFAULT 0,
							Deficiente CHAR(1) DEFAULT 'N',
							Observacao TEXT,
							Dt_Nascumento DATE,
							Dt_Cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
							Nr_Familia INT,
							Representante CHAR(1) DEFAULT 'N',  -- Se 'S' o Morador é o Representante da Família
							CONSTRAINT FK_NrFamiliaMorador FOREIGN KEY (Nr_Familia) References Familia (Nr_Familia)
							);

CREATE TABLE Familia ( 		Nr_Familia INT PRIMARY KEY AUTO_INCREMENT,
							Endereco VARCHAR(50),
							Complemento VARCHAR(100),
							Numero VARCHAR(10), 
							Bairro VARCHAR(30),
							Cidade VARCHAR (30),
							UF CHAR(2),
							CEP VARCHAR(10),
							RendaFamilia DECIMAL(7,2) DEFAULT 0,
							Dt_Cadastro DATETIME DEFAULT CURRENT_TIMESTAMP);

CREATE TABLE Auxilio (	Nr_Aux INT PRIMARY KEY AUTO_INCREMENT,
						Descricao VARCHAR (35)
						);

CREATE TABLE Doacao (	Nr_Doacao INT PRIMARY KEY AUTO_INCREMENT,
						Descricao VARCHAR (40)
						);


/*TABELA DE VINCULO DOS TIPOS DE AUXILIO QUE A FAMILIA POSSUI*/
CREATE TABLE Aux_Familia	(	Nr_Aux INT,
								Nr_Familia INT,
								CONSTRAINT FK_NrAuxFamilia FOREIGN KEY (Nr_Aux) References Auxilio (Nr_Aux),
								CONSTRAINT FK_NrFamiliaAux FOREIGN KEY (Nr_Familia) References Familia (Nr_Familia)
								);
/*TABELA DE VINCULO DE DOAÇÕES */
CREATE TABLE Doacao_Familia (	Nr_Familia INT,
								Nr_Doacao INT,
								CONSTRAINT FK_NrFamiliaDoacao FOREIGN KEY (Nr_Familia) References Familia (Nr_Familia),
								CONSTRAINT FK_NrDoacaoFamilia FOREIGN KEY (Nr_Doacao) References Doacao (Nr_Doacao),
								Dt_Doacao DATETIME DEFAULT CURRENT_TIMESTAMP
								);





/*ACESSOS DOS USUARIOS DO SISTEMA*/
CREATE TABLE Acessos (	Login VARCHAR(50),
						CadVolun CHAR(1) DEFAULT 'N', -- Cadastra Voluntario?
						AltVolun CHAR(1) DEFAULT 'N', --  Altera Dados do Voluntario?
						CadFami  CHAR(1) DEFAULT 'N', -- Cadastra Familia?
						AltFami CHAR(1) DEFAULT 'N', -- Altera  Dados da Familia?
						CadMora CHAR(1) DEFAULT 'N', -- Cadastra Morador?
						AltMora CHAR(1) DEFAULT 'N', -- Altera Dados do Morador?
						GerRel CHAR(1) DEFAULT 'N', -- Gerar Relatórios
						AltParan CHAR(1) DEFAULT 'N', -- Altera Parametros do Sistema
						GerenUser CHAR(1) DEFAULT 'N',  -- Gerenciar Usuário
						CadDoa CHAR(1) DEFAULT 'N', -- Cadastro de Doações
						AltDoa CHAR(1) DEFAULT 'N', -- Altera Doação
						ExcDoa CHAR(1) DEFAULT 'N', -- Excluir Doação
						CadAux CHAR(1) DEFAULT 'N', -- Cadastro de Auxílio
						AltAux CHAR(1) DEFAULT 'N', -- Alterar Auxílio
						ExcAux CHAR(1) DEFAULT 'N', -- Excluir Auxílio
						CONSTRAINT FK_AcessosVoluntario FOREIGN KEY (Login) References Voluntario (Login)
						);   


CREATE TABLE Parametros ( 	Parametro INT PRIMARY KEY,
							SysMaximizado CHAR(1) DEFAULT 'N', -- SISTEMA INICIAR MAXIMIZADO
							AtuPermUsuOn CHAR(1) DEFAULT 'N', --Atualizar Acesso do Usuário Assim que Alterar. N =  Relogar Para Atualizar | S = Atualiza Assim que é feito a Alteração
							AltSenhaPrimeiAcesso CHAR(1)  DEFAULT 'N', -- S =  Primeiro Login Solicitara Alteração de Senha.
							);

INSERT INTO Parametros (Parametro) VALUES (1)

INSERT INTO Voluntario (Login,Nome,Senha) VALUES ('TEC','TECNICO SISTEMA','0a94084e9131ca8f7a05c974b99d2489')