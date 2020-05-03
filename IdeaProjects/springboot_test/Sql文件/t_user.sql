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

 Date: 03/05/2020 13:06:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `user_sex` char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `is_delete` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'nxw321', 'asd', '1', '2020-04-30 17:22:47', 0);
INSERT INTO `t_user` VALUES (2, 'qwe', '1321', '1', '2020-04-30 17:27:38', 1);
INSERT INTO `t_user` VALUES (3, 'qwe', 'nxw', '1', '2020-04-30 21:09:13', 0);
INSERT INTO `t_user` VALUES (4, 'qweaaaa', 'qwea', '0', '2020-05-02 20:56:00', 1);
INSERT INTO `t_user` VALUES (5, 'qweaaaa', 'qwea', '0', '2020-05-02 20:56:00', 0);
INSERT INTO `t_user` VALUES (6, 'qweaaaa', 'qwea', '0', '2020-05-02 21:42:07', 0);

SET FOREIGN_KEY_CHECKS = 1;
