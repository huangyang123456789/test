/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : book_store

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-05-04 12:23:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` varchar(255) NOT NULL COMMENT '数据id',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否被删除，0-未作废，1-作废',
  `sort_no` int(11) NOT NULL COMMENT '序号',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) NOT NULL COMMENT '创建者',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `last_modified_by` varchar(40) NOT NULL COMMENT '修改者',
  `version` varchar(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('11', '普通用户', '0', '1', '2020-05-04 09:32:00', 'a', '2020-05-04 12:15:50', 'admin', '0');
INSERT INTO `t_sys_role` VALUES ('b18ea363-17b3-4d88-af2b-680058aea1af', '司机', '0', '2', '2020-05-04 10:39:19', 'admin', '2020-05-04 10:39:19', 'admin', '0');

-- ----------------------------
-- Table structure for `t_sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` varchar(255) NOT NULL COMMENT '数据id',
  `account` varchar(255) DEFAULT NULL COMMENT '账号',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `sex` tinyint(1) DEFAULT '0' COMMENT '性别，0-男，1-女',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `pwd` varchar(100) DEFAULT NULL COMMENT '密码',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除，0-未作废，1-作废',
  `sort_no` int(11) NOT NULL COMMENT '序号',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) NOT NULL COMMENT '创建者',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `last_modified_by` varchar(40) NOT NULL COMMENT '修改者',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('329baf0d-89e8-42b1-9efb-baf4b7783016', 'admin', 'ZEYGK', '0', '110', '123', '1122122', '123456', '0', '0', '2020-05-03 17:00:56', 'a', '2020-05-04 11:49:47', 'ZEYGK', '0');
INSERT INTO `t_sys_user` VALUES ('81f16282-5c21-4156-bd26-77d55157fc69', '123', '2345', '1', '110', '234@qq.com', '1234455', '123456', '0', '3', '2020-05-04 09:32:00', '2345', '2020-05-04 09:32:00', '2345', '0');

-- ----------------------------
-- Table structure for `t_sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role` (
  `id` varchar(255) NOT NULL COMMENT '数据id',
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `role_id` varchar(255) DEFAULT NULL COMMENT '角色id',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否被删除，0-未作废，1-作废',
  `sort_no` int(11) NOT NULL COMMENT '序号',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) NOT NULL COMMENT '创建者',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `last_modified_by` varchar(40) NOT NULL COMMENT '修改者',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user_role
-- ----------------------------
INSERT INTO `t_sys_user_role` VALUES ('31b8c498-2ab7-440d-8a5d-54e6ca9ab827', '81f16282-5c21-4156-bd26-77d55157fc69', 'b18ea363-17b3-4d88-af2b-680058aea1af', '0', '1', '2020-05-04 09:53:20', '11', '2020-05-04 12:00:42', '81f16282-5c21-4156-bd26-77d55157fc69', '0');
INSERT INTO `t_sys_user_role` VALUES ('a9ba283c-b67e-4960-9bab-79b46f529b59', '81f16282-5c21-4156-bd26-77d55157fc69', '11', '0', '0', '2020-05-04 09:50:07', '0', '2020-05-04 09:50:07', '0', '0');
