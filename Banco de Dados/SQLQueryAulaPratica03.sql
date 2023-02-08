-- Quantas Pessoas tem em cada departamento

SELECT departamento_id, COUNT(id) as num_funcionario
FROM funcionarios
GROUP BY departamento_id;

-- Qual a soma de salario por departamento

SELECT departamento_id, SUM(salario) as soma_salário, COUNT(id) AS numero_pessoas
FROM funcionarios
GROUP BY departamento_id;

-- Quantos homens tem por departamento e ganham mais de 3800

SELECT departamento_id, COUNT(id) AS num_funcionarios
FROM funcionarios
WHERE sexo = 'm' AND salario>3800
GROUP BY departamento_id;

-- Maximo salario por departamento 

SELECT departamento_id, MAX(salario) AS max_salario
FROM funcionarios
GROUP BY departamento_id
HAVING MAX(salario) > 4200;

-- Quantos homens tem por departamento, ganham mais de 3800 desconsiderando os departamentos que tenham apenas um homem

SELECT departamento_id, COUNT(id) AS num_funcionarios
FROM funcionarios
WHERE sexo = 'm' AND salario > 3800
GROUP BY departamento_id
HAVING COUNT(id) > 1;

-- Quantas mulheres que tem email @gmail tem media de salario maior que 4000 por departamento

SELECT departamento_id, COUNT (id) AS num_funcionarias, AVG (funcionarios.salario) AS media_salario
FROM funcionarios
WHERE sexo = 'f' AND email LIKE '%@gmail.com'
GROUP BY departamento_id
HAVING AVG (funcionarios.salario) > 4000;

--==============================================================================================================================================
-- Joins

CREATE TABLE categorias(
	id INT NOT NULL IDENTITY(1,1),
	nome VARCHAR(30),
	ativa CHAR(3),
	PRIMARY KEY (id)
);

Insert Into categorias (nome, ativa) Values
('Informatica','[v]'),
('Telefonia','[v]'),
('Games','[v]'),
('TV, Audio e Video','[v]'),
('Impressão e imagem','[v]');

SELECT * FROM categorias;

CREATE TABLE produtos(
	id INT NOT NULL IDENTITY(1,1),
	id_categoria INT,
	descrição VARCHAR(50),
	preco INT,
	url_imagem VARCHAR(100),
	PRIMARY KEY (id)
);

insert into produtos (id_categoria, descrição, preco) values
(1,'SSD 128GB', 300),
(1,'SSD 256GB', 500),
(1,'KIT TECLADO E MOUSE', 600),
(3,'PLAYSTATION 3', 1500),
(2,'SAMSUNG A51', 2500),
(4,'TELEVISÃO LG 55"', 3000),
(3,'PLAYSTATION 3 1TB', 1500),
(2,'SAMSUNG S9', 2500),
(2,'IPHONE 8', 2500),
(2,'IPHONE 9', 3000),
(2,'IPHONE X', 4000),
(4,'TELEVISÃO SAMSUNG 32"', 1000),
(4,'TELEVISÃO SAMSUNG 48"', 3000),
(3,'PLAYSTATION 4 1TB', 2800),
(3,'PLAYSTATION 5 1TB', 5000),
(1,'Teclado Razer Gamer', 250),
(1,'Fone de ouvido Hyperx',170),
(1,'Mouse Gamer Razer', 90),
(1,'Mouse Gamer Razer 2400', 200)
insert into produtos (descrição, preco) values
('Mouse Gamer', 280),
('Teclado Gamer', 390);

--Trazer apenas produtos que tenham categoria: INNER JOIN

SELECT * FROM produtos p
INNER JOIN categorias c
ON p.id_categoria = c.id;

-- Trazer todos os produtos mesmo que não tenha categoria e ainda assim trazer a listagem de categorias

SELECT * FROM produtos p
LEFT JOIN categorias c
ON p.id_categoria = c.id;

-- Trazer tudo da tabela direita inclusive as categorias que não tem produto

SELECT * FROM produtos p
RIGHT JOIN categorias c
ON p.id_categoria = c.id;

-- Trazer tudo de todos

SELECT * FROM produtos p
FULL JOIN categorias c
ON p.id_categoria = c.id;

-- Maior preço por categoria, trazendo qual categoria o produto é, apenas produtos categoriazados

SELECT c.nome, MAX(p.preco) as max_preco
FROM produtos p
INNER JOIN categorias c
ON p.id_categoria = c.id
GROUP BY c.nome;

-- Menor e Maior preço do produto da categoria e telefonia

SELECT c.nome, MAX(p.preco) as max_preco, MIN(p.preco) as min_preco
FROM produtos p
INNER JOIN categorias c
ON p.id_categoria = c.id
WHERE c.nome = 'games' or c.nome = 'telefonia'
GROUP BY c.nome;

-- Quanto custa o maior produto não catalogado

SELECT MAX(p.preco) as max_preco
FROM produtos p
LEFT JOIN categorias c
ON p.id_categoria = c.id
WHERE c.nome IS NULL

-- Média de preço de todos os produtos por categoria

SELECT c.nome, AVG(p.preco) as media_preco
FROM produtos p
LEFT JOIN categorias c
ON p.id_categoria = c.id
GROUP BY c.nome;

-- Tabela dos funcionarios "Millenium" com IF/Else e Tabela Auxiliar

WITH aux_table AS (SELECT YEAR(data_nascimento) as ano,
	CASE
		WHEN YEAR (data_nascimento) >= 1993 THEN 'True'
		ELSE 'False'
	END AS 'Is_millenium', 
	id
FROM funcionarios)

SELECT Is_millenium, COUNT(id) AS contagem
FROM aux_table
GROUP BY Is_millenium;

-- Criação de Views: Crie uma view que traga a média salarial dos homens e mulheres que nasceram nos anos 90 (é dinâmica)

CREATE VIEW view_mediasalario_sexo AS (
	SELECT sexo, AVG(salario) as media_salario
	FROM funcionarios
	WHERE YEAR(data_nascimento) >='1990'
	GROUP BY sexo
);

SELECT * FROM view_mediasalario_sexo;