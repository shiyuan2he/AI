/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.216.129-root
 Source Server Type    : MariaDB
 Source Server Version : 100117
 Source Host           : 192.168.216.129:3306
 Source Schema         : ai

 Target Server Type    : MariaDB
 Target Server Version : 100117
 File Encoding         : 65001

 Date: 15/09/2017 21:11:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_ai_log
-- ----------------------------
DROP TABLE IF EXISTS `t_ai_log`;
CREATE TABLE `t_ai_log` (
  `id` bigint(20) NOT NULL,
  `request_url` varchar(100) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `request_action` varchar(10) DEFAULT NULL,
  `timing` varchar(10) DEFAULT NULL,
  `request_method_type` varchar(100) DEFAULT NULL,
  `request_param` varchar(100) DEFAULT NULL,
  `user_remark` varchar(400) DEFAULT NULL,
  `request_ip` varchar(20) DEFAULT NULL,
  `request_address` varchar(50) DEFAULT NULL,
  `request_time` datetime DEFAULT NULL,
  `request_response` varchar(400) DEFAULT NULL,
  `request_thread_id` varchar(50) DEFAULT NULL,
  `request_source` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;;

SET FOREIGN_KEY_CHECKS = 1;
