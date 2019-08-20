-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


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
-- Definition of table `account_chart`
--

DROP TABLE IF EXISTS `account_chart`;
CREATE TABLE `account_chart` (
  `ac_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` int(10) unsigned default NULL,
  `company_id` int(10) unsigned default NULL,
  `ac_name` varchar(45) NOT NULL,
  `ac_parent` varchar(45) NOT NULL,
  `root` tinyint(1) NOT NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`ac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account_chart`
--

/*!40000 ALTER TABLE `account_chart` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_chart` ENABLE KEYS */;


--
-- Definition of table `author`
--

DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `a_id` int(10) unsigned NOT NULL auto_increment,
  `author_name` varchar(45) NOT NULL,
  `authr_type` varchar(45) NOT NULL,
  PRIMARY KEY  (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `author`
--

/*!40000 ALTER TABLE `author` DISABLE KEYS */;
/*!40000 ALTER TABLE `author` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `c_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` int(10) unsigned default NULL,
  `company_id` int(10) unsigned default NULL,
  `c_name` varchar(45) NOT NULL,
  `c_address` varchar(45) NOT NULL,
  `c_phone` varchar(45) NOT NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE `employe` (
  `e_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` int(10) unsigned default NULL,
  `company_id` int(10) unsigned default NULL,
  `e_name` varchar(45) NOT NULL,
  `e_address` varchar(45) NOT NULL,
  `e_phone` varchar(45) NOT NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employe`
--

/*!40000 ALTER TABLE `employe` DISABLE KEYS */;
/*!40000 ALTER TABLE `employe` ENABLE KEYS */;


--
-- Definition of table `master_journal`
--

DROP TABLE IF EXISTS `master_journal`;
CREATE TABLE `master_journal` (
  `m_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` varchar(45) NOT NULL,
  `c_id` varchar(45) NOT NULL,
  `e_id` varchar(45) NOT NULL,
  `s_id` varchar(45) NOT NULL,
  `company_id` varchar(45) default NULL,
  `voucher_no` varchar(45) NOT NULL,
  `voucher_type` varchar(45) NOT NULL,
  `narration` varchar(45) default NULL,
  PRIMARY KEY  (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_journal`
--

/*!40000 ALTER TABLE `master_journal` DISABLE KEYS */;
/*!40000 ALTER TABLE `master_journal` ENABLE KEYS */;


--
-- Definition of table `secondary_journal`
--

DROP TABLE IF EXISTS `secondary_journal`;
CREATE TABLE `secondary_journal` (
  `sec_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` int(10) unsigned NOT NULL,
  `m_id` int(10) unsigned NOT NULL,
  `company_id` int(10) unsigned default NULL,
  `ac_id` int(10) unsigned NOT NULL,
  `amount` double NOT NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`sec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `secondary_journal`
--

/*!40000 ALTER TABLE `secondary_journal` DISABLE KEYS */;
/*!40000 ALTER TABLE `secondary_journal` ENABLE KEYS */;


--
-- Definition of table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `s_id` int(10) unsigned NOT NULL auto_increment,
  `u_id` int(10) unsigned default NULL,
  `company_id` int(10) unsigned default NULL,
  `s_name` varchar(45) NOT NULL,
  `s_address` varchar(45) NOT NULL,
  `s_phone` varchar(45) NOT NULL,
  `contact_parson` varchar(45) default NULL,
  `status` varchar(45) default NULL,
  PRIMARY KEY  (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;


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
  `p_)insert` varchar(5) default NULL,
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
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
