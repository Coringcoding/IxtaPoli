CREATE DATABASE  IF NOT EXISTS `ixtapoli` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ixtapoli`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ixtapoli
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `idAdministrador` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `paterno` varchar(45) NOT NULL,
  `materno` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  PRIMARY KEY (`idAdministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `paterno` varchar(45) NOT NULL,
  `materno` varchar(45) NOT NULL,
  `escuela` varchar(45) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `promedio` float NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  `ruta` int(11) NOT NULL,
  `estatus` tinyint(1) NOT NULL,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bus`
--

DROP TABLE IF EXISTS `bus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bus` (
  `idBus` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idBus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bus`
--

LOCK TABLES `bus` WRITE;
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo` (
  `idEquipo` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  PRIMARY KEY (`idEquipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estacion`
--

DROP TABLE IF EXISTS `estacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estacion` (
  `idEstacion` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `ubicacion` varchar(100) NOT NULL,
  PRIMARY KEY (`idEstacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacion`
--

LOCK TABLES `estacion` WRITE;
/*!40000 ALTER TABLE `estacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `estacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faena`
--

DROP TABLE IF EXISTS `faena`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faena` (
  `idFaena` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `descripcion` varchar(200) NOT NULL,
  `ubicacion` varchar(100) NOT NULL,
  `materiales` varchar(100) NOT NULL,
  `video` blob,
  `cupo` int(11) NOT NULL,
  PRIMARY KEY (`idFaena`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faena`
--

LOCK TABLES `faena` WRITE;
/*!40000 ALTER TABLE `faena` DISABLE KEYS */;
/*!40000 ALTER TABLE `faena` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensaje`
--

DROP TABLE IF EXISTS `mensaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mensaje` (
  `idMensaje` int(11) NOT NULL,
  `contenido` varchar(100) DEFAULT NULL,
  `destinatario` int(11) DEFAULT NULL,
  `acceso` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idMensaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensaje`
--

LOCK TABLES `mensaje` WRITE;
/*!40000 ALTER TABLE `mensaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `mensaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recorrido`
--

DROP TABLE IF EXISTS `recorrido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recorrido` (
  `idRecorrido` int(11) NOT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `idEstacion` int(11) DEFAULT NULL,
  `hora` time NOT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`idRecorrido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recorrido`
--

LOCK TABLES `recorrido` WRITE;
/*!40000 ALTER TABLE `recorrido` DISABLE KEYS */;
/*!40000 ALTER TABLE `recorrido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relalumnobus`
--

DROP TABLE IF EXISTS `relalumnobus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relalumnobus` (
  `idRelAlumnoBus` int(11) NOT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `idBus` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRelAlumnoBus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relalumnobus`
--

LOCK TABLES `relalumnobus` WRITE;
/*!40000 ALTER TABLE `relalumnobus` DISABLE KEYS */;
/*!40000 ALTER TABLE `relalumnobus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relalumnotipous`
--

DROP TABLE IF EXISTS `relalumnotipous`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relalumnotipous` (
  `idRelAlumnoTipoUs` int(11) NOT NULL,
  `idAlumno` int(11) DEFAULT NULL,
  `idTipoUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRelAlumnoTipoUs`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relalumnotipous`
--

LOCK TABLES `relalumnotipous` WRITE;
/*!40000 ALTER TABLE `relalumnotipous` DISABLE KEYS */;
/*!40000 ALTER TABLE `relalumnotipous` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relequipousuario`
--

DROP TABLE IF EXISTS `relequipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relequipousuario` (
  `idEquipo` int(11) DEFAULT NULL,
  `idAlumno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relequipousuario`
--

LOCK TABLES `relequipousuario` WRITE;
/*!40000 ALTER TABLE `relequipousuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `relequipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relestacionbus`
--

DROP TABLE IF EXISTS `relestacionbus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relestacionbus` (
  `idRelEstacionBus` int(11) NOT NULL,
  `idEstacion` int(11) DEFAULT NULL,
  `idBus` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRelEstacionBus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relestacionbus`
--

LOCK TABLES `relestacionbus` WRITE;
/*!40000 ALTER TABLE `relestacionbus` DISABLE KEYS */;
/*!40000 ALTER TABLE `relestacionbus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relfaenaequipo`
--

DROP TABLE IF EXISTS `relfaenaequipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relfaenaequipo` (
  `idRelFaenaEquipo` int(11) NOT NULL,
  `idFaena` int(11) DEFAULT NULL,
  `idEquipo` int(11) DEFAULT NULL,
  `asistencia` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idRelFaenaEquipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relfaenaequipo`
--

LOCK TABLES `relfaenaequipo` WRITE;
/*!40000 ALTER TABLE `relfaenaequipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `relfaenaequipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipousuario` (
  `idTipoUsuario` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`idTipoUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-19 18:10:32
