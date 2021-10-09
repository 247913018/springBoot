/*
 Navicat Premium Data Transfer

 Source Server         : fanzhu
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : qixing

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 09/10/2021 09:48:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for u_user
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user`  (
  `ID` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `USER_NAME` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `MOBILE` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `EMAIL` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `PASSWORD` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `PROVINCE` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网省编码',
  `CITY` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址_省市',
  `COUNTY` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址_区县',
  `REGISTER_SOURCE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '注册来源01.微信小程序，02微信公众号，03支付宝生活号，04手机app，05网址网站',
  `REGISTER_TIME` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `PASSWORD_UPDATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '密码最后修改时间',
  `LAST_UPDATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '用户信息最后修改时间',
  `REMARK` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `DETAILS_ADDR` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `STATUS` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户状态01.正在使用，02.销户',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
