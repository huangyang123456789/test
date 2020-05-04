/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 04/05/2020 15:00:08
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
  `sex` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '0-女 1-男',
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
  `user_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('0143ff28-3ee8-4c27-8316-5981018a34eb', '1', '2aaa', '0', '4', '5', '6', 0, 0, '2020-05-02 15:57:35', 'a', '2020-05-02 15:57:35', 'a', 0, '312213');
INSERT INTO `t_sys_user` VALUES ('095bba05-0f7f-4f10-b4ca-effcf910d309', '1', '2aaa', '1', '4', '5', '6', 0, 0, '2020-05-02 15:55:29', 'a', '2020-05-02 15:55:29', 'a', 0, '312213');
INSERT INTO `t_sys_user` VALUES ('1', '2', 'szc', '0', '2', '4', '2', 1, 3, '2020-05-02 15:58:56', '1', '2020-05-26 15:59:01', '23', 23, '32');
INSERT INTO `t_sys_user` VALUES ('31c0a95c-140f-4183-bdc7-d34d587c629b', '1112131', '2a', '3', '4', '5', '7', 0, 0, '2020-05-04 12:15:21', 'b', '2020-05-04 12:15:21', 'b', 0, '312213');
INSERT INTO `t_sys_user` VALUES ('3834d349-a8b4-4ee1-85e8-d07dbfc9773b', '1112131', '2a', '3', '4', NULL, NULL, 0, 0, '2020-05-04 12:06:28', 'b', '2020-05-04 12:06:28', 'b', 0, '312213');
INSERT INTO `t_sys_user` VALUES ('55bf09c2-6010-46f0-b924-2a00a19b42b4', '1112131', '2a', '1', '4', '5', '7', 0, 0, '2020-05-03 17:02:38', 'b', '2020-05-03 17:02:38', 'b', 0, '312213');
INSERT INTO `t_sys_user` VALUES ('f6d1813d-d10f-46ef-ba29-ae3740fafce6', '1112131', '2a', '3', '4', '5', '7', 0, 0, '2020-05-04 12:14:11', 'b', '2020-05-04 12:14:11', 'b', 0, '312213');

SET FOREIGN_KEY_CHECKS = 1;
