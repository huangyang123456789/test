/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 03/05/2020 13:06:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_rolelist
-- ----------------------------
DROP TABLE IF EXISTS `t_rolelist`;
CREATE TABLE `t_rolelist`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_rolelist
-- ----------------------------
INSERT INTO `t_rolelist` VALUES (1, 'root');
INSERT INTO `t_rolelist` VALUES (2, 'host');
INSERT INTO `t_rolelist` VALUES (3, 'driver');

SET FOREIGN_KEY_CHECKS = 1;
