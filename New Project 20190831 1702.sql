-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema primaryaccounting
--

CREATE DATABASE IF NOT EXISTS primaryaccounting;
USE primaryaccounting;

--
-- Definition of table `accountchart`
--

DROP TABLE IF EXISTS `accountchart`;
CREATE TABLE `accountchart` (
  `ac_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` varchar(45) default NULL,
  `company_id` int(10) unsigned default NULL,
  `ac_name` varchar(45) NOT NULL,
  `ac_parent` varchar(45) NOT NULL,
  `root` varchar(10) NOT NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`ac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accountchart`
--

/*!40000 ALTER TABLE `accountchart` DISABLE KEYS */;
INSERT INTO `accountchart` (`ac_id`,`u_id`,`company_id`,`ac_name`,`ac_parent`,`root`,`status`) VALUES 
 (1,NULL,0,'Asset','0','Not','true'),
 (2,NULL,0,'Liabilities','0','Not','true'),
 (3,NULL,0,'Income','0','Not','true'),
 (4,NULL,0,'Expence','0','Not','true'),
 (5,NULL,0,'Owner\'s Equity','0','Not','true'),
 (6,NULL,0,'Current Assets','1','Not','true'),
 (7,NULL,0,'salary expene','4','Yes','true');
/*!40000 ALTER TABLE `accountchart` ENABLE KEYS */;


--
-- Definition of table `accounttype`
--

DROP TABLE IF EXISTS `accounttype`;
CREATE TABLE `accounttype` (
  `at_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` varchar(45) default NULL,
  `company_id` int(10) unsigned default NULL,
  `at_type` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`at_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounttype`
--

/*!40000 ALTER TABLE `accounttype` DISABLE KEYS */;
INSERT INTO `accounttype` (`at_id`,`u_id`,`company_id`,`at_type`,`name`,`address`,`phone`,`status`) VALUES 
 (1,NULL,0,'Customer','Dipu','Dhaka','01933932636','Active'),
 (2,NULL,0,'Customer','Anik','dhaka','01933932636','Active'),
 (3,NULL,0,'Customer','Monir ','Dhaka','01933932636','Active'),
 (4,NULL,0,'Employer','Tanvir','dhaka','01933932636','Active'),
 (5,NULL,0,'Employer','Shofiq','narayangonj','01933932636','Active');
/*!40000 ALTER TABLE `accounttype` ENABLE KEYS */;


--
-- Definition of table `author`
--

DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `a_id` int(11) NOT NULL auto_increment,
  `author_name` varchar(255) default NULL,
  `author_type` varchar(255) default NULL,
  `author_status` varchar(10) default NULL,
  PRIMARY KEY  (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `author`
--

/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` (`a_id`,`author_name`,`author_type`,`author_status`) VALUES 
 (3,'Accountent','accountent','True'),
 (4,'Programmer','progrmmar','True');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;


--
-- Definition of table `masterjournal`
--

DROP TABLE IF EXISTS `masterjournal`;
CREATE TABLE `masterjournal` (
  `m_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` varchar(45) default NULL,
  `company_id` int(10) unsigned default NULL,
  `voucher_no` varchar(45) NOT NULL,
  `voucher_type` varchar(45) NOT NULL,
  `narration` varchar(45) default NULL,
  `paydate` date default NULL,
  PRIMARY KEY  (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `masterjournal`
--

/*!40000 ALTER TABLE `masterjournal` DISABLE KEYS */;
INSERT INTO `masterjournal` (`m_id`,`u_id`,`company_id`,`voucher_no`,`voucher_type`,`narration`,`paydate`) VALUES 
 (1,NULL,0,'4','Debit Voucher','kghjkgh','2019-01-12'),
 (2,NULL,0,'8','Debit Voucher','salary','2019-01-31'),
 (3,NULL,0,'9','Debit Voucher','sfadfgfgh','2019-01-05'),
 (4,NULL,0,'10','Credit Voucher','fgsdgfhdfg','2019-01-13'),
 (5,NULL,0,'11','Credit Voucher','sdf','2019-01-16'),
 (6,NULL,0,'12','Credit Voucher','fg','2019-08-20'),
 (7,NULL,0,'545','Credit Voucher','fhgfdgh','2019-08-19'),
 (8,NULL,0,'8','Credit Voucher','bfcgf','2019-08-21');
/*!40000 ALTER TABLE `masterjournal` ENABLE KEYS */;


--
-- Definition of table `secondaryjournal`
--

DROP TABLE IF EXISTS `secondaryjournal`;
CREATE TABLE `secondaryjournal` (
  `sec_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` varchar(45) default NULL,
  `m_id` int(10) unsigned default NULL,
  `company_id` int(10) unsigned default NULL,
  `ac_id` int(10) unsigned NOT NULL,
  `debit` double NOT NULL,
  `credit` double NOT NULL,
  `sec_status` varchar(45) default NULL,
  PRIMARY KEY  (`sec_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `secondaryjournal`
--

/*!40000 ALTER TABLE `secondaryjournal` DISABLE KEYS */;
INSERT INTO `secondaryjournal` (`sec_id`,`u_id`,`m_id`,`company_id`,`ac_id`,`debit`,`credit`,`sec_status`) VALUES 
 (1,'0',0,0,7,45463,45463,'True'),
 (2,'0',0,0,7,546645,546645,'True'),
 (3,'0',0,0,7,50000,50000,'True'),
 (4,'0',0,0,3,45345,45345,'True'),
 (5,'0',0,0,3,857,857,'True'),
 (6,'0',0,0,3,456,456,'True'),
 (7,'0',0,0,4,456,456,'True'),
 (8,'0',0,0,3,500.5,500.5,'True');
/*!40000 ALTER TABLE `secondaryjournal` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `emailid` varchar(255) NOT NULL,
  `password` varchar(255) default NULL,
  `phone` varchar(255) default NULL,
  `username` varchar(255) default NULL,
  PRIMARY KEY  (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`emailid`,`password`,`phone`,`username`) VALUES 
 ('dipu@gmail.com','123','123456789','dipu');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user_authorization`
--

DROP TABLE IF EXISTS `user_authorization`;
CREATE TABLE `user_authorization` (
  `ua_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` int(10) unsigned NOT NULL,
  `a_id` int(10) unsigned NOT NULL,
  `form_name` varchar(45) NOT NULL,
  `parmisson` varchar(10) NOT NULL,
  `p_insert` varchar(5) default NULL,
  `p_update` varchar(5) default NULL,
  `p_delete` varchar(5) default NULL,
  `status` varchar(5) default NULL,
  PRIMARY KEY  (`ua_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_authorization`
--

/*!40000 ALTER TABLE `user_authorization` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_authorization` ENABLE KEYS */;


--
-- Definition of table `usermenu`
--

DROP TABLE IF EXISTS `usermenu`;
CREATE TABLE `usermenu` (
  `menuid` int(10) unsigned NOT NULL auto_increment,
  `menuname` varchar(45) NOT NULL,
  `url` varchar(45) NOT NULL,
  PRIMARY KEY  (`menuid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usermenu`
--

/*!40000 ALTER TABLE `usermenu` DISABLE KEYS */;
INSERT INTO `usermenu` (`menuid`,`menuname`,`url`) VALUES 
 (1,'author','/author'),
 (2,'account type','/accounttype');
/*!40000 ALTER TABLE `usermenu` ENABLE KEYS */;


--
-- Definition of table `userrole`
--

DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `emailid` varchar(255) NOT NULL,
  `password` varchar(255) default NULL,
  `role` varchar(255) default NULL,
  `status` varchar(255) default NULL,
  PRIMARY KEY  (`emailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userrole`
--

/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
INSERT INTO `userrole` (`emailid`,`password`,`role`,`status`) VALUES 
 ('dipu@gmail.com','123','ROLE_ADMIN','True');
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
