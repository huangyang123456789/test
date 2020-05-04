/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 04/05/2020 15:31:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '数据id',
  `user_acct` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '账号',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '0-女 1-男',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `id_card` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL COMMENT '作废标记（1作废，0未作废）',
  `sort_no` int(11) NOT NULL COMMENT '序号（从0开始）',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建者(登录账号)',
  `gmt_modified` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `last_modified_by` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '更新者(登录账号)',
  `version` int(11) NOT NULL COMMENT '版本号',
  `user_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('565e9857-b374-4c02-9946-0be936ccf45e', '20200202', 'huahuaaaa', 0, '111111111', '21525', '11111', 0, 0, '2020-05-04 14:03:18', 'cny', '2020-05-04 14:03:18', 'cny', 0, '1212121');
INSERT INTO `t_sys_user` VALUES ('75b62434-e7e8-4b10-b302-e9d49a6b7f1c', '20200504', 'xiaomingaaa', 1, '111111111', '21525', '11111', 0, 0, '2020-05-04 13:23:23', 'cny', '2020-05-04 13:23:23', 'cny', 0, '1212121');
INSERT INTO `t_sys_user` VALUES ('a6bfb143-2f78-4feb-aa37-760ad1a466a5', '20200331', 'xiaohuaaaa', 1, '111111111', '21525', '11111', 0, 0, '2020-05-04 14:02:45', 'cny', '2020-05-04 14:02:45', 'cny', 0, '1212121');

SET FOREIGN_KEY_CHECKS = 1;
