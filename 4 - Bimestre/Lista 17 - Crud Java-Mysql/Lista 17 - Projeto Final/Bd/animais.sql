-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16-Nov-2023 às 19:24
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `animais`
--
create database `animais`;
use `animais`;
-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE `cadastro` (
  `Usuario` varchar(255) NOT NULL,
  `Senha` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`Usuario`, `Senha`) VALUES
('a', '123'),
('b', '456');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pet`
--

CREATE TABLE `pet` (
  `Cod_animal` int(11) NOT NULL,
  `Nome_animal` varchar(100) NOT NULL,
  `Especie` varchar(50) NOT NULL,
  `Raca` varchar(50) NOT NULL,
  `Cor` varchar(50) NOT NULL,
  `Nascimento` date NOT NULL,
  `Sexo` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pet`
--

INSERT INTO `pet` (`Cod_animal`, `Nome_animal`, `Especie`, `Raca`, `Cor`, `Nascimento`, `Sexo`) VALUES
(1, 'Luz', 'Gato', 'Bengal Longhair', 'Preto', '2018-11-14', 'Feminino'),
(2, 'Blue', 'Cachorro', 'Bichon Frisé', 'Azul e Branco', '2020-06-18', 'Masculino '),
(3, 'Theo', 'Pássaro', 'Trinca-Ferro', 'Preto e Vermelho', '2020-08-10', 'Masculino'),
(4, 'Rosa', 'Peixe', 'Peixe arco-íris', 'Rosa e Laranja', '2021-07-26', 'Feminino '),
(5, 'Kitana', 'Coelho', 'Coelhos Cabeça de Leão', 'Branco', '2022-09-20', 'Feminino ');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pet`
--
ALTER TABLE `pet`
  ADD PRIMARY KEY (`Cod_animal`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pet`
--
ALTER TABLE `pet`
  MODIFY `Cod_animal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
