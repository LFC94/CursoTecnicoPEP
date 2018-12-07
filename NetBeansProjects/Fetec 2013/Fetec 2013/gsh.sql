-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 15/11/2013 às 01h01min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `gsh`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarhospede`
--

CREATE TABLE IF NOT EXISTS `cadastrarhospede` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `cnpj` varchar(100) NOT NULL,
  `profissao` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `numend` varchar(15) NOT NULL,
  `bairro` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `cep` varchar(25) NOT NULL,
  `email` varchar(100) NOT NULL,
  `estadoCivil` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastroproduto`
--

CREATE TABLE IF NOT EXISTS `cadastroproduto` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `fabricante` varchar(100) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `formapagamento`
--

CREATE TABLE IF NOT EXISTS `formapagamento` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `formaPagamento` varchar(50) NOT NULL,
  `preco` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `hospedagem`
--

CREATE TABLE IF NOT EXISTS `hospedagem` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `codQuarto` varchar(100) NOT NULL,
  `diaChegada` date NOT NULL,
  `diaSaida` date NOT NULL,
  `pacote` varchar(10) NOT NULL,
  `alimentacao` int(11) NOT NULL,
  `hospede` int(11) NOT NULL,
  `acesinfa` varchar(1) NOT NULL,
  `acesfuma` varchar(1) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `loginfuncionario`
--

CREATE TABLE IF NOT EXISTS `loginfuncionario` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `funcao` varchar(50) NOT NULL,
  `cep` varchar(50) NOT NULL,
  `pais` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `nuendere` varchar(7) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `admin` varchar(1) NOT NULL,
  `permicao1` varchar(50) NOT NULL,
  `permicao2` varchar(50) NOT NULL,
  `permicao3` varchar(50) NOT NULL,
  `permicao4` varchar(50) NOT NULL,
  `permicao5` varchar(50) NOT NULL,
  `permicao6` varchar(50) NOT NULL,
  `permicao7` varchar(50) NOT NULL,
  `permicao8` varchar(50) NOT NULL,
  `permicao9` varchar(50) NOT NULL,
  `permicao10` varchar(50) NOT NULL,
  `permicao11` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `loginfuncionario`
--

INSERT INTO `loginfuncionario` (`codigo`, `login`, `senha`, `Nome`, `cpf`, `funcao`, `cep`, `pais`, `endereco`, `nuendere`, `bairro`, `cidade`, `estado`, `admin`, `permicao1`, `permicao2`, `permicao3`, `permicao4`, `permicao5`, `permicao6`, `permicao7`, `permicao8`, `permicao9`, `permicao10`, `permicao11`) VALUES
(1, 'Lucas', '123', 'Lucas Felipe', '11235809609', 'Teste', '12345678', 'Brasil', 'Topazio', '360', 'Patafufo', 'Para de Minas', 'Mg', 'N', 'S', 'N', 'N', 'S', 'N', 'S', 'N', 'N', 'N', 'N', 'N'),
(2, 'LU', '123', 'LUCAS', '12343', 'HDSJKAL', '2346', 'GHJ', 'DFGHK', '12', 'FHG', 'YIKL', 'MG', 'N', 'S', 'N', 'S', 'N', 'N', 'S', 'N', 'N', 'N', 'N', 'N');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pacotes`
--

CREATE TABLE IF NOT EXISTS `pacotes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `opcoes` varchar(100) NOT NULL,
  `precos` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `quartos`
--

CREATE TABLE IF NOT EXISTS `quartos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `andar` varchar(45) NOT NULL,
  `numQuarto` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `camas` varchar(45) NOT NULL,
  `conforto1` varchar(100) NOT NULL,
  `conforto2` varchar(100) NOT NULL,
  `conforto3` varchar(100) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `quartos`
--

INSERT INTO `quartos` (`codigo`, `andar`, `numQuarto`, `tipo`, `camas`, `conforto1`, `conforto2`, `conforto3`, `valor`) VALUES
(1, '1', '12', 'SIMPLES', '4', '', '', '', 10);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
