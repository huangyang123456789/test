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

 Date: 03/05/2020 19:22:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_zhong
-- ----------------------------
DROP TABLE IF EXISTS `t_zhong`;
CREATE TABLE `t_zhong`  (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_zhong
-- ----------------------------
INSERT INTO `t_zhong` VALUES (1, 1, 4);
INSERT INTO `t_zhong` VALUES (2, 2, 2);
INSERT INTO `t_zhong` VALUES (3, 3, 6);
INSERT INTO `t_zhong` VALUES (4, 4, 3);
INSERT INTO `t_zhong` VALUES (5, 5, 1);
INSERT INTO `t_zhong` VALUES (6, 6, 5);
INSERT INTO `t_zhong` VALUES (7, 7, 5);

SET FOREIGN_KEY_CHECKS = 1;
