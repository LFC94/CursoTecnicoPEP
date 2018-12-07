-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 08/05/2013 às 14h09min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `igrejas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `dizimistas`
--

CREATE TABLE IF NOT EXISTS `dizimistas` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `dizimo` double NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `bairro` varchar(200) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `cod_proficoes` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cod_proficoes` (`cod_proficoes`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `dizimistas`
--

INSERT INTO `dizimistas` (`codigo`, `nome`, `dizimo`, `endereco`, `bairro`, `telefone`, `cod_proficoes`) VALUES
(1, 'Jose da Silva', 5, 'R: Edivaldo ,352', 'Serra do ouro', '(35)69586569', 3),
(2, 'Maria da Dores Oliveira', 20, 'R: Terezinha , 536', 'Dona Rosa', '(56)59875644', 1),
(3, 'Hilton Lesse Costa', 2.5, 'R: topazio,360', 'Patafufo', '(37)58976545', 4),
(4, 'Gean Perreira', 3.5, 'R:eldorado, 243', 'Padre Bento', '(63)63884920', 3),
(5, 'Marcia silvera costa', 7.6, 'R: Rubi,10', 'santo antonio', '(86)86875894', 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `proficoes`
--

CREATE TABLE IF NOT EXISTS `proficoes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome_proficao` varchar(200) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `proficoes`
--

INSERT INTO `proficoes` (`codigo`, `nome_proficao`) VALUES
(1, 'Técnico de eletronica'),
(2, 'Alciliar de Enfermegem'),
(3, 'Motorista'),
(4, 'Técnico de Informatica '),
(5, 'secretaria'),
(6, 'balconista ');

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `dizimistas`
--
ALTER TABLE `dizimistas`
  ADD CONSTRAINT `dizimistas_ibfk_1` FOREIGN KEY (`cod_proficoes`) REFERENCES `proficoes` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
