/*
 Navicat Premium Data Transfer

 Source Server         : sujuku
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : sys

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 03/05/2020 19:24:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名字',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, '医院董事长');
INSERT INTO `t_role` VALUES (2, '医院总经理');
INSERT INTO `t_role` VALUES (3, '医院主任');
INSERT INTO `t_role` VALUES (4, '医生');
INSERT INTO `t_role` VALUES (5, '护士');
INSERT INTO `t_role` VALUES (6, '保安队队长');

SET FOREIGN_KEY_CHECKS = 1;
