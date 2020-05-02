/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3307
 Source Schema         : user_model

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 02/05/2020 20:23:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sort_no` bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '排序用序号',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `last_modified_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `version` bigint(20) UNSIGNED NOT NULL COMMENT '版本号',
  `is_deleted` tinyint(3) UNSIGNED NOT NULL COMMENT '是否被删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, '管理员', 0, '2020-04-30 17:38:11', 'admin', '2020-04-30 17:38:36', 'yjf', 1, 0);
INSERT INTO `t_role` VALUES (2, '司机', 0, '2020-04-30 17:38:11', 'admin', '2020-04-30 17:38:36', 'yjf', 1, 0);

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phoneNum` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `id_card` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sort_no` bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '排序用序号',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `last_modified_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `version` bigint(20) UNSIGNED NOT NULL COMMENT '版本号',
  `is_deleted` tinyint(3) UNSIGNED NOT NULL COMMENT '是否被删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
INSERT INTO `t_user_info` VALUES (1, 'sssssssss', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 17:27:44', 'yjf', '2020-04-30 21:21:38', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (2, '1324156', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 17:30:20', 'yjf', '2020-04-30 18:41:14', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (3, '1324156', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 17:31:56', 'yjf', '2020-04-30 18:41:15', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (4, '1324156', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 18:49:53', 'yjf', '2020-04-30 18:49:53', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (5, '1324156', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 19:19:39', 'yjf', '2020-04-30 19:19:39', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (6, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:08:15', 'yjf', '2020-04-30 20:08:15', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (7, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:08:48', 'yjf', '2020-04-30 20:08:48', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (8, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:09:49', 'yjf', '2020-04-30 20:09:49', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (9, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:10:14', 'yjf', '2020-04-30 20:10:14', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (10, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:10:57', 'yjf', '2020-04-30 20:10:57', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (11, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:11:19', 'yjf', '2020-04-30 20:11:19', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (12, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:11:58', 'yjf', '2020-04-30 20:11:58', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (13, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:14:31', 'yjf', '2020-04-30 20:14:31', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (14, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:15:11', 'yjf', '2020-04-30 20:15:11', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (15, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:18:33', 'yjf', '2020-04-30 20:18:33', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (16, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:19:45', 'yjf', '2020-04-30 20:19:45', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (17, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:20:18', 'yjf', '2020-04-30 20:20:18', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (18, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:22:37', 'yjf', '2020-04-30 20:22:37', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (19, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:24:51', 'yjf', '2020-04-30 20:24:51', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (20, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:31:03', 'yjf', '2020-04-30 20:31:03', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (21, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:32:27', 'yjf', '2020-04-30 20:32:27', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (22, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:35:43', 'yjf', '2020-04-30 20:35:43', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (23, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:37:20', 'yjf', '2020-04-30 20:37:20', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (24, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:37:59', 'yjf', '2020-04-30 20:37:59', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (25, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:38:59', 'yjf', '2020-04-30 20:38:59', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (26, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:40:41', 'yjf', '2020-04-30 20:40:41', 'yjf', 1, 0);
INSERT INTO `t_user_info` VALUES (27, 'wwwww', '2313', '1', '1321', '4651652', '123165', 'fsdfsd', 0, '2020-04-30 20:41:03', 'yjf', '2020-04-30 20:41:03', 'yjf', 1, 0);

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `role_id` int(20) NULL DEFAULT NULL,
  `user_id` int(20) NULL DEFAULT NULL,
  `sort_no` bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '排序用序号',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `last_modified_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `version` bigint(20) UNSIGNED NOT NULL COMMENT '版本号',
  `is_deleted` tinyint(3) UNSIGNED NOT NULL COMMENT '是否被删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, 1, 1, 0, '2020-04-30 17:39:25', 'yg', '2020-04-30 21:13:46', 'hj', 1, 1);
INSERT INTO `t_user_role` VALUES (2, 2, 1, 0, '2020-04-30 17:39:25', 'yg', '2020-04-30 21:13:46', 'hj', 1, 1);
INSERT INTO `t_user_role` VALUES (3, 1, 27, 0, '2020-04-30 20:41:03', 'yjf', '2020-04-30 20:41:03', 'yjf', 1, 0);
INSERT INTO `t_user_role` VALUES (4, 2, 27, 0, '2020-04-30 20:41:03', 'yjf', '2020-04-30 20:41:03', 'yjf', 1, 0);
INSERT INTO `t_user_role` VALUES (5, 1, 1, 0, '2020-04-30 21:21:38', 'aaaa', '2020-04-30 21:21:38', 'yjf', 1, 0);
INSERT INTO `t_user_role` VALUES (6, 2, 1, 0, '2020-04-30 21:21:38', 'aaaa', '2020-04-30 21:21:38', 'yjf', 1, 0);

SET FOREIGN_KEY_CHECKS = 1;
