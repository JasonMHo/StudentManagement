/*
 Navicat Premium Data Transfer

 Source Server         : hzlocalhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost
 Source Database       : Student

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : utf-8

 Date: 02/11/2018 23:47:02 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `gradeId` int(4) NOT NULL,
  `gradeName` varchar(20) NOT NULL,
  PRIMARY KEY (`gradeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `grade`
-- ----------------------------
BEGIN;
INSERT INTO `grade` VALUES ('1', 'G1'), ('2', 'G2'), ('3', 'G3'), ('4', '学士后');
COMMIT;

-- ----------------------------
--  Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '无名氏',
  `sex` varchar(4) NOT NULL DEFAULT '男',
  `gradeId` int(4) DEFAULT NULL,
  `profile` varchar(50) DEFAULT NULL,
  `age` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `student`
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES ('1', '张小强', '男', '4', '我是张小强，我喜欢游泳', '25'), ('2', '王美丽', '女', '1', '我是王美丽，我喜欢跑步', '20'), ('3', '李刚', '男', '3', '我是李刚，我喜欢音乐', '24'), ('4', '黄蓉', '女', '4', '我是黄蓉，我喜欢靖哥哥', '26');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'admin', 'admin'), ('2', 'test', 'test'), ('3', 'jason', 'jason');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
