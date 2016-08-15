-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 15-08-2016 a las 15:40:58
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `registroamiscamp`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `alumno`
-- 

CREATE TABLE `alumno` (
  `idalumno` int(10) unsigned NOT NULL auto_increment,
  `Name&Ape` varchar(100) NOT NULL,
  `DNI` int(8) NOT NULL,
  `Edad` int(2) NOT NULL,
  `Facultad` varchar(20) NOT NULL,
  `Escuela` varchar(45) NOT NULL,
  `CodAlumno` int(9) NOT NULL,
  `Sexo` varchar(1) NOT NULL,
  PRIMARY KEY  (`idalumno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `alumno`
-- 

