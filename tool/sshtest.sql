/*
Navicat MySQL Data Transfer

Source Server         : 10.1.2.159
Source Server Version : 50614
Source Host           : 10.1.2.159:3306
Source Database       : sshtest

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2016-09-28 17:27:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9BDFD45D76DC8994` (`address_id`),
  CONSTRAINT `FK9BDFD45D76DC8994` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `publishdate` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES ('2', 'hjf', '2015-04-08 13:26:32', 'fghdg');
INSERT INTO `demo` VALUES ('3', 'fgjh', '2015-04-08 13:26:40', 'gf');
INSERT INTO `demo` VALUES ('4', 'jnkljl', '2015-04-08 14:31:02', 'kjl;n;');
INSERT INTO `demo` VALUES ('5', 'kl;kl;k;l;k', '2015-04-08 14:31:09', 'kl;kl;');
INSERT INTO `demo` VALUES ('6', 'asdfasdfsd', '2015-04-08 14:31:50', 'sdfaf');
INSERT INTO `demo` VALUES ('7', 'gh', '2015-04-08 14:33:09', 'Hoj');
INSERT INTO `demo` VALUES ('8', 'fdasf', '2015-04-08 15:34:31', 'fdsa');
INSERT INTO `demo` VALUES ('9', 'junit-content0', '2015-04-08 16:00:48', 'junit-test0');
INSERT INTO `demo` VALUES ('10', 'junit-content1', '2015-04-08 16:00:48', 'junit-test1');
INSERT INTO `demo` VALUES ('14', 'junit-content5', '2015-04-08 16:00:48', 'junit-test5');
INSERT INTO `demo` VALUES ('22', 'junit-content2', '2015-04-08 16:27:49', 'junit-test2');
INSERT INTO `demo` VALUES ('23', 'junit-content3', '2015-04-08 16:27:49', 'junit-test3');
INSERT INTO `demo` VALUES ('24', 'junit-content4', '2015-04-08 16:27:49', 'junit-test4');
INSERT INTO `demo` VALUES ('25', 'junit-content5', '2015-04-08 16:27:49', 'junit-test5');
INSERT INTO `demo` VALUES ('26', 'junit-content6', '2015-04-08 16:27:49', 'junit-test6');
INSERT INTO `demo` VALUES ('27', 'junit-content7', '2015-04-08 16:27:49', 'junit-test7');
INSERT INTO `demo` VALUES ('28', 'junit-content8', '2015-04-08 16:27:49', 'junit-test8');
INSERT INTO `demo` VALUES ('29', 'junit-content9', '2015-04-08 16:27:49', 'junit-test9');
INSERT INTO `demo` VALUES ('30', 'junit-content', '2015-04-08 16:29:18', 'junit-test');
INSERT INTO `demo` VALUES ('31', 'junit-content', '2015-04-08 16:31:06', 'junit-test');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptid` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dept
-- ----------------------------

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `dept_deptid` int(11) DEFAULT NULL,
  PRIMARY KEY (`empid`),
  KEY `FK4AFD4ACE796AC585` (`dept_deptid`),
  CONSTRAINT `FK4AFD4ACE796AC585` FOREIGN KEY (`dept_deptid`) REFERENCES `dept` (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for USER
-- ----------------------------
DROP TABLE IF EXISTS `USER`;
CREATE TABLE `USER` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of USER
-- ----------------------------
INSERT INTO `USER` VALUES ('1', 'dsf', 'aaaa');
