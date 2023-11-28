/*
SQLyog Community v8.71 
MySQL - 5.0.13-rc-nt : Database - aux_lp2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`aux_lp2` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `aux_lp2`;

/*Table structure for table `alumnos` */

DROP TABLE IF EXISTS `alumnos`;

CREATE TABLE `alumnos` (
  `alu_cod` int(11) NOT NULL,
  `alu_nom` varchar(100) NOT NULL,
  `ciu_cod` int(11) NOT NULL,
  PRIMARY KEY  (`alu_cod`),
  KEY `ciudad_alumnos_fk` (`ciu_cod`),
  CONSTRAINT `ciudad_alumnos_fk` FOREIGN KEY (`ciu_cod`) REFERENCES `ciudad` (`ciu_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `alumnos` */

insert  into `alumnos`(`alu_cod`,`alu_nom`,`ciu_cod`) values (100,'JUAN',1),(200,'ANA',2);

/*Table structure for table `ciudad` */

DROP TABLE IF EXISTS `ciudad`;

CREATE TABLE `ciudad` (
  `ciu_cod` int(11) NOT NULL,
  `ciu_descri` varchar(50) NOT NULL,
  PRIMARY KEY  (`ciu_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ciudad` */

insert  into `ciudad`(`ciu_cod`,`ciu_descri`) values (1,'ASUNCION'),(2,'LUQUE');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
