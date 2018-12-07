SELECT * FROM exerciciossql.quartos;
/* Listar o número e o andar de todos os quartos ocupados, ordenados por andar e por valor de diária*/
SELECT numero, andar FROM Quartos WHERE ocupado="s" ORDER BY andar,diaria;
/*Listar o número e o andar de todos os quartos livres que possuam conexão de internet, ordenados do
mais barato para o mais caro; */
SELECT numero, andar FROM Quartos WHERE ocupado="n" AND internet="s" ORDER BY diaria;
/*Listar o número e o andar de todos os quartos que ainda não foram ocupados no ano de 2012 */
SELECT numero, andar FROM Quartos WHERE ocupado="n" AND YEAR(ultimaOcupacao)< "2013";
/* Listar o número e o andar de todos os quartos que possuem internet e TV e que não sejam do quarto
andar;*/
SELECT numero, andar FROM Quartos WHERE tv="s" AND internet="s" AND andar!="4";
/* Listar o número e o andar de todos os quartos livres cujas diárias estejam entre R$ 120,00 e 
R$ 400,00;*/
SELECT numero, andar FROM Quartos WHERE ocupado="n" AND diaria<"400" AND diaria>"120";
/* Listar o número e o andar de todos os quartos que possuam ao menos 2 camas e que estejam acima
do décimo andar, ordenados por valor de diária; */
SELECT numero, andar FROM Quartos WHERE cama>=2 AND andar>10 ORDER BY diaria;
/* Listar o número e o andar de todos os quartos livres que possuam internet, TV e cujo valor da diária
seja menor que R$ 1000,00;*/
SELECT numero, andar FROM Quartos WHERE ocupado="n" AND tv="s" AND internet="s" AND diaria<1000;
/* Listar o número e o andar de todos os quartos cuja numeração termine em 2 e que possuam apenas
uma cama*/
SELECT numero, andar FROM Quartos WHERE camas ="1" AND numero LIKE "%2";
/* Listar o número e o andar de todos os quartos ocupados que não possuam internet e que estejam
entre o terceiro e o sexto andar;*/
SELECT numero, andar FROM Quartos WHERE ocupado="s" AND internet="n" AND andar>3 AND andar<6;
/* Listar o número e o andar de todos os quartos que possuam TV e que ainda não foram ocupados no
mês de março de 2012, do mais caro para o mais barato;*/
SELECT numero, andar FROM Quartos 
WHERE tv="s" AND  (MONTH(ultimaOcupacao)!=3 And YEAR(ultimaOcupacao)!=2013) ORDER BY diaria;