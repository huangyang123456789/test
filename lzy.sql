/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : lzy

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 04/05/2020 17:23:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_class
-- ----------------------------
DROP TABLE IF EXISTS `s_class`;
CREATE TABLE `s_class`  (
  `s_id` int(12) NOT NULL AUTO_INCREMENT,
  `student_id` int(12) NULL DEFAULT NULL COMMENT '学生id',
  `s_class` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '学生选修课程',
  `s_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '0-未删除，1-已删除',
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of s_class
-- ----------------------------
INSERT INTO `s_class` VALUES (1, 3, '数学', 0);
INSERT INTO `s_class` VALUES (2, 3, '英语', 0);
INSERT INTO `s_class` VALUES (5, 3, '体育', 1);
INSERT INTO `s_class` VALUES (6, NULL, NULL, NULL);
INSERT INTO `s_class` VALUES (7, NULL, NULL, NULL);
INSERT INTO `s_class` VALUES (8, 3, '计算机', 0);

-- ----------------------------
-- Table structure for t_class
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class`  (
  `t_id` int(12) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(12) NULL DEFAULT NULL COMMENT '老师工号',
  `t_class` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '所教课程名字',
  `t_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '0-未删除，1-已删除',
  PRIMARY KEY (`t_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_class
-- ----------------------------
INSERT INTO `t_class` VALUES (1, 1, '数学', 0);
INSERT INTO `t_class` VALUES (2, 1, '英语', 0);
INSERT INTO `t_class` VALUES (3, 2, '计算机', 0);
INSERT INTO `t_class` VALUES (4, 2, '体育1', 1);

-- ----------------------------
-- Table structure for t_members
-- ----------------------------
DROP TABLE IF EXISTS `t_members`;
CREATE TABLE `t_members`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '0-男，1-女',
  `type` tinyint(1) NULL DEFAULT NULL COMMENT '0-学生，1-老师',
  `is_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '0-未删除，1-已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_members
-- ----------------------------
INSERT INTO `t_members` VALUES (1, 'aaa', 0, 1, 0);
INSERT INTO `t_members` VALUES (2, 'bbb', 1, 1, 0);
INSERT INTO `t_members` VALUES (3, 'ccc', 1, 0, 0);
INSERT INTO `t_members` VALUES (4, 'kwq', NULL, NULL, NULL);
INSERT INTO `t_members` VALUES (5, 'lzyaaa', 0, 0, NULL);
INSERT INTO `t_members` VALUES (6, 'lzyaaa', 0, 0, 1);
INSERT INTO `t_members` VALUES (7, 'hyhaaa', 0, 0, NULL);
INSERT INTO `t_members` VALUES (8, NULL, NULL, NULL, NULL);
INSERT INTO `t_members` VALUES (9, '123aaa', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
