-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: facturi
-- ------------------------------------------------------
-- Server version	5.7.13-log

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
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `ID_Client` int(11) NOT NULL AUTO_INCREMENT,
  `Nume_Client` varchar(45) NOT NULL,
  `Adresa` varchar(45) NOT NULL,
  `CUI` int(10) unsigned NOT NULL,
  PRIMARY KEY (`CUI`),
  KEY `ID_Client` (`ID_Client`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (5,'Zara','Str.Fashion',213456),(4,'H&M','Str.Fashion',567893),(3,'Domo','Str.Magazinelor',657890),(7,'Fabrica de bere','Str.Iasomiei',765431),(8,'Masini','Str.Vitezei',765499),(2,'Flanco','Str.Magazinelor',9898765),(1,'Emag','Str.Magazinelor',12567889);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detaliu_factura`
--

DROP TABLE IF EXISTS `detaliu_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detaliu_factura` (
  `ID_DetaliuFactura` int(11) NOT NULL AUTO_INCREMENT,
  `Pret` double unsigned NOT NULL,
  `Cantitate` int(10) unsigned NOT NULL,
  `ID_Produs` int(11) NOT NULL,
  `ID_Factura` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID_DetaliuFactura`),
  KEY `ID_Produs_idx` (`ID_Produs`),
  KEY `ID_Factura` (`ID_Factura`),
  CONSTRAINT `ID_Factura` FOREIGN KEY (`ID_Factura`) REFERENCES `factura` (`ID_Factura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ID_Produs` FOREIGN KEY (`ID_Produs`) REFERENCES `produs` (`ID_Produs`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detaliu_factura`
--

LOCK TABLES `detaliu_factura` WRITE;
/*!40000 ALTER TABLE `detaliu_factura` DISABLE KEYS */;
INSERT INTO `detaliu_factura` VALUES (1,20,2,3,1),(2,40,4,2,1),(3,100,1,1,1),(4,300,3,4,2),(5,250,5,5,4),(6,20,3,3,2),(7,100,2,1,2);
/*!40000 ALTER TABLE `detaliu_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `ID_Factura` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Data_Factura` date NOT NULL,
  `Serie_Factura` varchar(45) NOT NULL,
  `ID_Client` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Factura`),
  KEY `ID_Client_idx` (`ID_Client`),
  CONSTRAINT `ID_Client` FOREIGN KEY (`ID_Client`) REFERENCES `client` (`ID_Client`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,'2016-09-24','345609090',1),(2,'2016-04-22','456787654',2),(3,'2016-09-02','098752690',4),(4,'2016-09-06','567893312',1),(5,'2015-06-22','543667788',1),(6,'2015-03-07','042445997',5);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produs`
--

DROP TABLE IF EXISTS `produs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produs` (
  `ID_Produs` int(11) NOT NULL AUTO_INCREMENT,
  `Nume_Produs` varchar(45) NOT NULL,
  `Cod_Produs` int(11) DEFAULT NULL,
  `TVA` float NOT NULL,
  PRIMARY KEY (`ID_Produs`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produs`
--

LOCK TABLES `produs` WRITE;
/*!40000 ALTER TABLE `produs` DISABLE KEYS */;
INSERT INTO `produs` VALUES (1,'Rochie',23456789,0.24),(2,'Masina de spalat',23456754,0.24),(3,'Camasa',54367892,0.24),(4,'Cos de rufe',34523452,0.24),(5,'Desperados',34567090,0.09),(6,'Uscator de par',65789321,0.24),(7,'Pijamale',34234567,0.09);
/*!40000 ALTER TABLE `produs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Gigel','Gigel description'),(2,'Vasile','Vasile description');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-03 16:23:42
