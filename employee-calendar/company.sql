# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.21)
# Database: company
# Generation Time: 2018-12-12 14:01:25 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table config
# ------------------------------------------------------------

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `setting` varchar(150) DEFAULT NULL,
  `val` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;

INSERT INTO `config` (`id`, `setting`, `val`)
VALUES
	(1,'allowed_hours',50);

/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table employee
# ------------------------------------------------------------

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;

INSERT INTO `employee` (`id`, `name`)
VALUES
	(1,'Tim Cook'),
	(2,'Bill Gates'),
	(3,'Elon Musk'),
	(4,'Larry Page'),
	(5,'Sergey Brin'),
	(6,'John Smith');

/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table hibernate_sequence
# ------------------------------------------------------------

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;

INSERT INTO `hibernate_sequence` (`next_val`)
VALUES
	(7),
	(7);

/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table calendar
# ------------------------------------------------------------

DROP TABLE IF EXISTS `calendar`;

CREATE TABLE `calendar` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `hours` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `calendar` WRITE;
/*!40000 ALTER TABLE `calendar` DISABLE KEYS */;

INSERT INTO `calendar` (`id`, `emp_id`, `date`, `hours`)
VALUES
	(1,1,'2017-10-05',3),
	(2,1,'2016-12-12',4),
	(3,2,'2019-01-01',8),
	(4,3,'2018-03-12',1),
	(5,3,'2018-03-24',1),
	(6,3,'2018-10-15',1),
	(7,4,'2018-11-01',10),
	(8,5,'2018-12-01',9),
	(9,5,'2018-12-02',2);

/*!40000 ALTER TABLE `calendar` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
