-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 03/07/2013 às 14h07min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `loja`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `fabricante` varchar(200) NOT NULL,
  `valor` double NOT NULL,
  `valor_comissao` double NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo` (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`codigo`, `nome`, `fabricante`, `valor`, `valor_comissao`) VALUES
(1, 'Playstation', 'Sony', 400, 30),
(2, 'Xbox', 'Microsoft', 400, 30),
(3, 'Tablet ', 'Samsung', 1000, 50),
(4, 'Iphone', 'Ipple', 1500, 100);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE IF NOT EXISTS `vendas` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `cod_produto` int(11) NOT NULL,
  `cod_vendedor` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `data` date NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cod_produto` (`cod_produto`),
  KEY `cod_vendedor` (`cod_vendedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`codigo`, `cod_produto`, `cod_vendedor`, `quantidade`, `data`) VALUES
(1, 1, 3, 2, '2011-11-16'),
(2, 2, 4, 1, '2010-07-15'),
(3, 3, 1, 1, '2009-03-18'),
(4, 4, 5, 1, '2013-05-13'),
(5, 2, 2, 1, '2013-06-04');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendedores`
--

CREATE TABLE IF NOT EXISTS `vendedores` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `regiao` varchar(20) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `vendedores`
--

INSERT INTO `vendedores` (`codigo`, `nome`, `regiao`) VALUES
(1, 'Jose Augusto', 'Sul'),
(2, 'Maria das Dores', 'sudeste'),
(3, 'Antonio Perreira ', 'centro oeste'),
(4, 'Fernanda Silva', 'norte'),
(5, 'Jose Texeira', 'nordeste');

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`cod_vendedor`) REFERENCES `vendedores` (`codigo`),
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`cod_produto`) REFERENCES `produtos` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
