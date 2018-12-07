-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 02/04/2013 às 13h33min
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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
