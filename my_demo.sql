/*
Navicat MySQL Data Transfer

Source Server         : my_aliyun
Source Server Version : 80018
Source Host           : 101.132.158.185:3306
Source Database       : my_demo

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2019-11-16 11:13:21
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'zhangsan', 'zhangsan');
