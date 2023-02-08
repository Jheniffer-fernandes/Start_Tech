/* Exercicio*/

--Crie uma view que traga o nome do departamento, sexo dos funcionarios
-- e a contagem dos funcionarios
-- Contudo, apenas os departamentos que tenham a letra 'd' e seus respectivos funcionarios 
--sejam mulheres que usam gmail e homens que usam hotmail
--Alem disso, a contagem de funcionario por sexo e por departamento deve ser maior que 1

CREATE VIEW view_contagem_funcionarios_por_departamento_com_letra_d AS (
	SELECT departamentos.departamento, COUNT (funcionarios.id) AS num_funcionarios 
	FROM funcionarios
	INNER JOIN departamentos
	ON funcionarios.departamento_id = departamentos.id
	WHERE sexo = 'f' AND email LIKE '%gmail.com'
		OR sexo = 'm' AND email LIKE '%hotmail.com'
	GROUP BY departamento
	HAVING departamento LIKE '%d%'
);

SELECT * FROM view_contagem_funcionarios_por_departamento_com_letra_d;

--QUAL a soma da televisão e do playstation, contudo some apenas dos produtos com preço
--maior que 1500
--traga o nome da sua categoria

SELECT c.nome, SUM(p.preco) as preço
FROM produtos p
INNER JOIN categorias c
ON p.id_categoria = c.id
WHERE p.descrição LIKE 'Televisão%' or p.descrição LIKE 'Playstation%'
AND preco > 1500
GROUP BY c.nome;

--QUAL o preço do mouse mais caro, traga o nome da sua categoria

SELECT MAX (p.preco) AS maior_preço, c.nome
FROM produtos p
LEFT JOIN categorias c
ON p.id_categoria = c.id
WHERE p.descrição LIKE 'Mouse%'
GROUP BY c.nome;