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

 Date: 03/05/2020 19:24:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '数据id',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '0-女 1-男',
  `is_deleted` tinyint(1) NOT NULL COMMENT '作废标记（1作废，0未作废）',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `user_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'wt', 1, 0, '2020-05-03 19:16:27', '1');
INSERT INTO `t_user` VALUES ('2', 'cjy', 1, 0, '2020-05-03 19:17:08', '1');
INSERT INTO `t_user` VALUES ('3', 'zt', 1, 0, '2020-05-03 19:17:30', '1');
INSERT INTO `t_user` VALUES ('4', 'lr', 1, 0, '2020-05-03 19:17:43', '1');
INSERT INTO `t_user` VALUES ('5', 'ljy', 0, 0, '2020-05-03 19:17:59', '521');
INSERT INTO `t_user` VALUES ('6', 'lyw', 0, 0, '2020-05-03 19:18:10', '520');
INSERT INTO `t_user` VALUES ('7', 'sy', 0, 0, '2020-05-03 19:18:32', '1314');

SET FOREIGN_KEY_CHECKS = 1;
