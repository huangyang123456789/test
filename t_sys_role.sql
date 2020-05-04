/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 04/05/2020 23:26:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role`  (
  `id` int(3) NOT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES (1, '管理员');
INSERT INTO `t_sys_role` VALUES (2, '店长');
INSERT INTO `t_sys_role` VALUES (3, '司机');

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '数据id',
  `user_acct` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '账号',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sex` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '0-女 1-男',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_card` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL COMMENT '作废标记（1作废，0未作废）',
  `sort_no` int(11) NOT NULL COMMENT '序号（从0开始）',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建者(登录账号)',
  `gmt_modified` datetime(0) DEFAULT NULL COMMENT '更新时间',
  `last_modified_by` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新者(登录账号)',
  `version` int(11) NOT NULL COMMENT '版本号',
  `user_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('123', '123', 'newname', '0', '18042587896', '1254@qq.com', '565253', 0, 0, '2020-05-03 16:23:22', 'aaa', NULL, NULL, 0, NULL);
INSERT INTO `t_sys_user` VALUES ('1234', '1234', 'bbb', '1', '18045265', '231@qq.com', '1353', 0, 1, '2020-05-03 18:11:26', 'bbb', NULL, NULL, 0, NULL);
INSERT INTO `t_sys_user` VALUES ('213', '123', '123', '1', '123', '123', '453', 1, 0, '2020-05-03 19:38:35', '13', '2020-05-03 19:38:35', '535', 0, '45343');
INSERT INTO `t_sys_user` VALUES ('2133', '123', '123', '1', '123', '123', '453', 1, 0, '2020-05-03 19:56:22', '13', '2020-05-03 19:56:22', '535', 0, '45343');
INSERT INTO `t_sys_user` VALUES ('2134', '123', '123', '0', '123', '123', '453', 1, 0, '2020-05-03 19:56:56', '13', '2020-05-03 19:56:56', '535', 0, '45343');
INSERT INTO `t_sys_user` VALUES ('2134121', '123', '123', '0', '123', '123', '453', 1, 0, '2020-05-03 20:12:59', '13', '2020-05-03 20:12:59', '535', 0, '45343');
INSERT INTO `t_sys_user` VALUES ('35e366df-c003-44de-a4f7-1526594d2bf2', '111', '2323aaa', '1', '123', '123', '321', 0, 0, '2020-05-03 20:24:08', 'A', '2020-05-03 20:24:08', 'A', 0, '12335');
INSERT INTO `t_sys_user` VALUES ('729ad6f0-0e95-4b83-a9dc-e9a698ca8b6b', '111', '2323aaa', '1', '123', '123', '321', 0, 0, '2020-05-03 20:24:44', 'A', '2020-05-03 20:24:44', 'A', 0, '12335');
INSERT INTO `t_sys_user` VALUES ('7e8aff95-9e36-49c4-8ee7-7673c084f67c', '111', '2323aaa', '1', '123', '123', '321', 0, 0, '2020-05-03 20:23:41', 'A', '2020-05-03 20:23:41', 'A', 0, '12335');
INSERT INTO `t_sys_user` VALUES ('82276283-0152-4e1a-aa7d-6124d25c241e', '111', '2323aaa', '1', '123', '123', '321', 0, 0, '2020-05-03 20:23:42', 'A', '2020-05-03 20:23:42', 'A', 0, '12335');
INSERT INTO `t_sys_user` VALUES ('908234ee-23cd-4ffe-9c2d-7485c6e0edef', '111', '2323aaa', '1', '123', '123', '321', 0, 0, '2020-05-03 20:24:23', 'A', '2020-05-03 20:24:23', 'A', 0, '12335');
INSERT INTO `t_sys_user` VALUES ('b9d1f84f-137e-4533-ba36-f8a3b22c1af6', '111', '2323aaa', '1', '123', '123', '321', 0, 0, '2020-05-03 20:23:35', 'A', '2020-05-03 20:23:35', 'A', 0, '12335');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` int(3) NOT NULL,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `role_id` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, '123', 1);
INSERT INTO `t_user_role` VALUES (2, '1234', 3);
INSERT INTO `t_user_role` VALUES (3, '213', 2);
INSERT INTO `t_user_role` VALUES (4, '2133', 1);

SET FOREIGN_KEY_CHECKS = 1;
