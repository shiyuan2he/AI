DROP TABLE IF EXISTS `t_ai_user`;
CREATE TABLE `t_ai_user` (
  `id` varchar(20) NOT NULL COMMENT '主键id',
  `user_name` varchar(20) DEFAULT '' COMMENT '用户姓名',
  `password` varchar(20) DEFAULT '' COMMENT '密码',
  `nick_name` varchar(20) DEFAULT '' COMMENT '用户昵称',
  `phone` varchar(20) DEFAULT '' COMMENT '手机号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_name` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(100) DEFAULT '' COMMENT '用户备注',
  `real_name` varchar(8) DEFAULT '' COMMENT '用户真实姓名',
  `encrypt_type` varchar(10) DEFAULT '' COMMENT 'MD5,AES,BASE64',
  `create_user` varchar(20) DEFAULT '' COMMENT '创建者',
  `update_user` varchar(20) DEFAULT '' COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人工智能系统用户表';

DROP TABLE IF EXISTS `t_ai_log`;
CREATE TABLE `t_ai_log` (
  `id` varchar(20) NOT NULL COMMENT '主键id',
  `request_url` varchar(100) DEFAULT '' COMMENT '请求地址',
  `user_id` varchar(20) DEFAULT '' COMMENT '用户id',
  `request_action` varchar(10) DEFAULT '' COMMENT '请求动作',
  `timing` varchar(10) DEFAULT '' COMMENT '请求耗时',
  `request_method_type` varchar(100) DEFAULT '' COMMENT '请求方法类型，get,post',
  `request_param` varchar(100) DEFAULT '' COMMENT '请求参数',
  `user_remark` varchar(400) DEFAULT '' COMMENT '用户标识',
  `request_ip` varchar(20) DEFAULT '' COMMENT '请求ip',
  `request_address` varchar(50) DEFAULT '' COMMENT '请求地址',
  `request_time` datetime DEFAULT NULL COMMENT '请求时间',
  `request_response` varchar(400) DEFAULT '' COMMENT '请求响应',
  `request_thread_id` varchar(50) DEFAULT '' COMMENT '请求线程id',
  `request_source` varchar(10) DEFAULT '' COMMENT '请求来源',
  PRIMARY KEY (`id`),
  KEY `fk_user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_ai_user` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人工智能系统日志表';

DROP TABLE IF EXISTS `t_ai_chat_sinogram`;
CREATE TABLE `t_ai_chat_sinogram` (
  `id` varchar(20) NOT NULL COMMENT '主键',
  `key` varchar(20) DEFAULT '' COMMENT '键',
  `value` varchar(4) DEFAULT '' COMMENT '值',
  `value_length` int(1) DEFAULT NULL COMMENT '长度',
  `groupType` varchar(10) DEFAULT '' COMMENT '分类',
  `create_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '创建时间',
  `create_user` varchar(12) DEFAULT '' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `update_user` varchar(12) DEFAULT '' COMMENT '更新者',
  `sort` int(6) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='汉字字典表';
