drop table if exists t_ai_user;
/*==============================================================*/
/* Table: t_ai_user                                             */
/*==============================================================*/
create table t_ai_user
(
  id                   varchar(20) not null comment '主键id',
  user_name            varchar(20) comment '用户姓名',
  password             varchar(20) comment '密码',
  nick_name            varchar(20) comment '用户昵称',
  phone                varchar(20) comment '手机号',
  create_time          datetime comment '创建时间',
  update_name          datetime comment '更新时间',
  remark               varchar(100) comment '用户备注',
  real_name            varchar(8) comment '用户真实姓名',
  encrypt_type         varchar(10) comment 'MD5,AES,BASE64',
  create_user          varchar(20) comment '创建者',
  update_user         varchar(20) comment '更新者',
  primary key (id)
);
alter table t_ai_user comment '人工智能系统用户表';

/*==============================================================*/
/* Table: t_ai_log                                              */
/*==============================================================*/
drop table if exists t_ai_log;
create table t_ai_log
(
  id                   varchar(20) not null comment '主键id',
  request_url          varchar(100) comment '请求地址',
  user_id              varchar(20) comment '用户id',
  request_action       varchar(10) comment '请求动作',
  timing               varchar(10) comment '请求耗时',
  request_method_type  varchar(100) comment '请求方法类型，get,post',
  request_param        varchar(100) comment '请求参数',
  user_remark          varchar(400) comment '用户标识',
  request_ip           varchar(20) comment '请求ip',
  request_address      varchar(50) comment '请求地址',
  request_time         datetime comment '请求时间',
  request_response     varchar(400) comment '请求响应',
  request_thread_id    varchar(50) comment '请求线程id',
  request_source       varchar(10) comment '请求来源',
  primary key (id)
);
alter table t_ai_log comment '人工智能系统日志表';
alter table t_ai_log add constraint FK_Reference_1 foreign key (user_id)
references t_ai_user (id) on delete restrict on update restrict;
