-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 22/05/2013 às 14h11min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

CREATE TABLE IF NOT EXISTS `alunos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `alunos`
--

INSERT INTO `alunos` (`codigo`, `nome`, `endereco`, `telefone`) VALUES
(1, 'Zidane de Souza Santos', 'Rua leopoldina de almeida', '1111111111111'),
(2, 'Katarina de Almeida Jordão', 'Avenida das alamedas', '2222222222222'),
(3, 'Zurg Wallstreet Jones', 'Rua das Constelações', '3333333333333'),
(4, 'João Silveira Xavier', 'Rua Bartolomeu Dias', '4444444444444');

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimos`
--

CREATE TABLE IF NOT EXISTS `emprestimos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data_emprestimo` date NOT NULL,
  `data_devolucao` date NOT NULL,
  `cod_livro` int(11) NOT NULL,
  `cod_aluno` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cod_aluno` (`cod_aluno`),
  KEY `cod_livro` (`cod_livro`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `emprestimos`
--

INSERT INTO `emprestimos` (`codigo`, `data_emprestimo`, `data_devolucao`, `cod_livro`, `cod_aluno`) VALUES
(1, '2013-01-01', '2013-05-15', 2, 2),
(2, '2013-01-02', '2013-05-10', 4, 4),
(3, '2013-02-07', '2013-02-19', 3, 3),
(4, '2013-05-02', '2013-05-14', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `livros`
--

CREATE TABLE IF NOT EXISTS `livros` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `categoria` varchar(200) NOT NULL,
  `num_paginas` int(11) NOT NULL,
  `editor` varchar(200) NOT NULL,
  `autor` varchar(200) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `livros`
--

INSERT INTO `livros` (`codigo`, `nome`, `categoria`, `num_paginas`, `editor`, `autor`) VALUES
(1, 'A arte da guerra', 'administração', 150, 'Jardim dos Livros', 'Sun Tzu'),
(2, 'O Hobbit', 'Literatura Estrangeira / Romance', 320, 'Wmf Martins Fontes', 'Tolkien , J. R. R.'),
(3, 'Assassin''s Creed - Irmandade', 'Literatura estrangeira ', 392, 'Galera Record', 'Bowden, Oliver'),
(4, 'World Of Warcraft - Wolfheart', 'Literatura estrangera  ', 464, 'Pocket Books Usa', ' Knaak, Richard A.');

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `emprestimos`
--
ALTER TABLE `emprestimos`
  ADD CONSTRAINT `emprestimos_ibfk_3` FOREIGN KEY (`cod_aluno`) REFERENCES `alunos` (`codigo`),
  ADD CONSTRAINT `emprestimos_ibfk_2` FOREIGN KEY (`cod_livro`) REFERENCES `livros` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
