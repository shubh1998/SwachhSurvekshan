-- MySQL dump 10.13  Distrib 5.1.30, for Win32 (ia32)
--
-- Host: 127.0.0.1    Database: liberary
-- ------------------------------------------------------
-- Server version	5.1.30-community

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
-- Table structure for table `complaintform`
--

DROP TABLE IF EXISTS `complaintform`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `complaintform` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `useremail` varchar(50) NOT NULL,
  `title` varchar(100) NOT NULL,
  `details` varchar(1000) NOT NULL,
  `date` varchar(20) NOT NULL,
  `status` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `complaintform`
--

LOCK TABLES `complaintform` WRITE;
/*!40000 ALTER TABLE `complaintform` DISABLE KEYS */;
INSERT INTO `complaintform` VALUES (1,'shriyanshneema27@gmail.com','the','enviromental issues','2018-04-25',0),(2,'shyamchohan121@gmail.com','the','nskjanjksjan','2018-01-31',0),(3,'shriyanshneema@gmail.com','tgr','bhvbhbj','2018-01-31',0);
/*!40000 ALTER TABLE `complaintform` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `feedback` (
  `useremail` varchar(50) NOT NULL,
  `rating` int(11) NOT NULL,
  `feedback` varchar(1000) NOT NULL,
  PRIMARY KEY (`useremail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES ('shriyanshneema27@gmail.com',9,'its good');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `login` (
  `username` varchar(10) DEFAULT NULL,
  `password` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('shriyansh',1234),('harshil',5678),('neema',9999),('shubham',7777);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login1`
--

DROP TABLE IF EXISTS `login1`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `login1` (
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `contactno` varchar(15) NOT NULL,
  `address` varchar(40) NOT NULL,
  `city` varchar(15) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `password` varchar(10) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `login1`
--

LOCK TABLES `login1` WRITE;
/*!40000 ALTER TABLE `login1` DISABLE KEYS */;
INSERT INTO `login1` VALUES ('shubham gupta','raj30nov@yahoo.com','9111160927','ushanagar','Indore','Male','12345'),('shriyansh neema','shriyanshneema27@gmail.com','9111160927','ushanagar','Indore','Male','neema');
/*!40000 ALTER TABLE `login1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `student` (
  `rollno` int(11) NOT NULL,
  `name` varchar(15) DEFAULT NULL,
  `phno` int(11) DEFAULT NULL,
  `mail` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (60,'shriyansh',94012,'neema@gmail.com');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student1`
--

DROP TABLE IF EXISTS `student1`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `student1` (
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(15) DEFAULT NULL,
  `physics` int(11) DEFAULT NULL,
  `chemistry` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `student1`
--

LOCK TABLES `student1` WRITE;
/*!40000 ALTER TABLE `student1` DISABLE KEYS */;
INSERT INTO `student1` VALUES (60,'Shriyansh Neema',90,90,90),(63,'shubham joshi',89,67,55),(68,'shyam',89,67,56);
/*!40000 ALTER TABLE `student1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-15 12:17:48
