-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-07-2022 a las 09:27:22
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mecanica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `llantas`
--

CREATE TABLE `llantas` (
  `CODIGO` varchar(10) NOT NULL,
  `MARCA` varchar(20) NOT NULL,
  `TAMAÑO` varchar(10) NOT NULL,
  `PRECIO` float NOT NULL,
  `TORNILLOS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `llantas`
--

INSERT INTO `llantas` (`CODIGO`, `MARCA`, `TAMAÑO`, `PRECIO`, `TORNILLOS`) VALUES
('L01', 'BRIDGESTONE', '15\'', 20.66, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanicos`
--

CREATE TABLE `mecanicos` (
  `USER` varchar(10) NOT NULL,
  `PASSWORD` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mecanicos`
--

INSERT INTO `mecanicos` (`USER`, `PASSWORD`) VALUES
('pablo', 'pablo'),
('sebas', 'sebas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `neumaticos`
--

CREATE TABLE `neumaticos` (
  `CODIGO` varchar(10) NOT NULL,
  `MARCA` varchar(20) NOT NULL,
  `TAMAÑO` varchar(10) NOT NULL,
  `PRECIO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `neumaticos`
--

INSERT INTO `neumaticos` (`CODIGO`, `MARCA`, `TAMAÑO`, `PRECIO`) VALUES
('234', '1234', '1234', 555),
('N01', 'MICHELIN', '15\'', 60.79),
('N02', 'ASD', 'ASD', 56);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruedas`
--

CREATE TABLE `ruedas` (
  `CODIGO` varchar(10) NOT NULL,
  `TAMAÑO` varchar(10) NOT NULL,
  `LLANTA` varchar(30) NOT NULL,
  `NEUMATICO` varchar(20) NOT NULL,
  `PRECIO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ruedas`
--

INSERT INTO `ruedas` (`CODIGO`, `TAMAÑO`, `LLANTA`, `NEUMATICO`, `PRECIO`) VALUES
('R01', '15\'', 'MICHELIN', 'MICHELIN', 50.6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tornillos`
--

CREATE TABLE `tornillos` (
  `CODIGO` varchar(10) NOT NULL,
  `MARCA` varchar(20) NOT NULL,
  `PRECIO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tornillos`
--

INSERT INTO `tornillos` (`CODIGO`, `MARCA`, `PRECIO`) VALUES
('T01', 'STANLEY', 0.99),
('T02', 'ACME', 0.6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `valvulas`
--

CREATE TABLE `valvulas` (
  `CODIGO` varchar(10) NOT NULL,
  `TIPO` varchar(20) NOT NULL,
  `PRECIO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `valvulas`
--

INSERT INTO `valvulas` (`CODIGO`, `TIPO`, `PRECIO`) VALUES
('ASD', 'ASD', 45),
('V01', 'GENERICA', 5.48);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `llantas`
--
ALTER TABLE `llantas`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `mecanicos`
--
ALTER TABLE `mecanicos`
  ADD PRIMARY KEY (`USER`);

--
-- Indices de la tabla `neumaticos`
--
ALTER TABLE `neumaticos`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `ruedas`
--
ALTER TABLE `ruedas`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `tornillos`
--
ALTER TABLE `tornillos`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `valvulas`
--
ALTER TABLE `valvulas`
  ADD PRIMARY KEY (`CODIGO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
