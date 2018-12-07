-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 10/04/2013 às 14h05min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `exercicio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `endereco` varchar(255) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`codigo`, `nome`, `cpf`, `endereco`, `telefone`) VALUES
(1, 'José Lins do Rego', '55555555555', 'Rua Jose Geraldo', '32325544'),
(2, 'kassandra de Oliveira Ferrira', '11111111111', 'Rua Ouro Branco', '32316688'),
(3, 'Jose de Alcantara Mares', '5555555551', 'Rua Jose Geraldo da Silva', '32325522'),
(4, 'kassandra de Oliveira Ferrira', '1111111111', 'Rua Ouro Branco', '32316688'),
(5, 'Onofre da Silva', '1234567890', 'Rua Carmo da Mata', '55556666'),
(6, 'Lucas Magno', '6666666666', 'Rua Topazio', '32318899');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE IF NOT EXISTS `veiculos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `modelo` varchar(20) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `ano` int(11) NOT NULL,
  `cor` varchar(20) NOT NULL,
  `placa` varchar(7) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `utilizacao` varchar(20) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`codigo`, `modelo`, `marca`, `ano`, `cor`, `placa`, `tipo`, `utilizacao`) VALUES
(1, 'Brasília', 'VolvoWagen', 1974, 'amarela', 'CHU1000', 'Carro', 'Profisional'),
(2, 'Palio', 'FIAT', 2009, 'preto', 'GHS9010', 'Carro', 'Particular'),
(3, 'Gol', 'VolvoWagen', 2000, 'Verde', 'LYF2501', 'Carro', 'Particular'),
(4, 'Golf', 'VolvoWagen', 2010, 'Vermelho', 'KYS5213', 'Carro', 'Particular'),
(5, 'Falcon', 'Yamaha', 2009, 'preto', 'HYA2516', 'Moto', 'Profisional'),
(6, 'A5', 'Audi', 2005, 'branco', 'GHA6448', 'Carro', 'Particular'),
(7, 'Fiorino', 'FIAT', 2000, 'Branco', 'GHS9754', 'Carro', 'Profisional'),
(8, 'YBR', 'Yamaha', 2009, 'Branco', 'HYY7564', 'Moto', 'Particular');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE IF NOT EXISTS `vendas` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `vendedor` varchar(255) NOT NULL,
  `valor` float NOT NULL,
  `tipo_pgto` varchar(30) NOT NULL,
  `nf` int(11) NOT NULL,
  `cod_carro` int(11) NOT NULL,
  `cod_clinte` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cod_carro` (`cod_carro`),
  KEY `cod_clinte` (`cod_clinte`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`codigo`, `data`, `vendedor`, `valor`, `tipo_pgto`, `nf`, `cod_carro`, `cod_clinte`) VALUES
(1, '2013-02-20', 'Zac Afron', 30000, 'A vista', 123, 4, 6),
(2, '2013-03-04', 'Madonna Oliveira Silva da Costa', 45000, 'Parcelado', 456, 5, 2);

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`cod_clinte`) REFERENCES `clientes` (`codigo`),
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`cod_carro`) REFERENCES `veiculos` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
