/* -----------------------------用户表 t_system_user------------------------------- */
CREATE TABLE t_system_user
(
    "uid" varchar2(32) primary key,
    userName varchar2(30),
    password varchar2(128),
    mobile char(11),
    email varchar(128),
    birthday date,
    status char(1),
    createtime date default sysdate not null
);
comment on table t_system_user is '系统用户表';
comment on column  t_system_user."uid" is '主键ID';
comment on column  t_system_user.userName is '用户名';
comment on column  t_system_user.password is '密码';
comment on column  t_system_user.mobile is '手机号';
comment on column  t_system_user.email is '邮箱';
comment on column  t_system_user.birthday is '生日';
comment on column  t_system_user.status is '状态';
comment on column  t_system_user.createtime is '创建时间';

/* -----------------------------角色表 T_SYSTEM_ROLE----------------------------- */
CREATE TABLE T_SYSTEM_ROLE
(
  rid         VARCHAR2(32) primary key,
  role_name   VARCHAR2(32),
  role_sign   VARCHAR2(128),
  status  char(1),
  description VARCHAR2(128)
);
-- Add comments to the table 
comment on table T_SYSTEM_ROLE is '角色表';
-- Add comments to the columns 
comment on column T_SYSTEM_ROLE.rid is '角色id';
comment on column T_SYSTEM_ROLE.role_name is '角色名';
comment on column T_SYSTEM_ROLE.role_sign is '角色标识,程序中判断使用,如admin';
comment on column T_SYSTEM_ROLE.status is '角色状态';
comment on column T_SYSTEM_ROLE.description is '角色描述,UI界面显示使用';

/* -----------------------------权限表 T_SYSTEM_PERMISSION----------------------------- */
CREATE TABLE T_SYSTEM_PERMISSION
(
  pid             VARCHAR2(32) primary key,
  permission_name VARCHAR2(32),
  permission_sign VARCHAR2(128),
  status  char(1),
  description     VARCHAR2(128)
);
-- Add comments to the table 
comment on table T_SYSTEM_PERMISSION is '权限表';
-- Add comments to the columns 
comment on column T_SYSTEM_PERMISSION.pid is '权限id';
comment on column T_SYSTEM_PERMISSION.permission_name is '权限名';
comment on column T_SYSTEM_PERMISSION.permission_sign is '权限标识,程序中判断使用,如user:create';
comment on column T_SYSTEM_PERMISSION.status is '权限状态';
comment on column T_SYSTEM_PERMISSION.description is '权限描述,UI界面显示使用';

/* -----------------------------用户角色表 T_SYSTEM_USER_ROLE----------------------------- */
create table T_SYSTEM_USER_ROLE
(
  id      VARCHAR2(20) primary key,
  "uid" VARCHAR2(32),
  rid VARCHAR2(32)
);
-- Add comments to the table 
comment on table T_SYSTEM_USER_ROLE is '用户角色表';
-- Add comments to the columns 
comment on column T_SYSTEM_USER_ROLE.id is '表id';
comment on column T_SYSTEM_USER_ROLE."uid" is '用户表id';
comment on column T_SYSTEM_USER_ROLE.rid is '角色表id';


/* -----------------------------角色权限表 T_SYSTEM_ROLE_PERMISSION----------------------------- */
create table T_SYSTEM_ROLE_PERMISSION
(
  id            VARCHAR2(20) primary key,
  rid       VARCHAR2(32),
  pid VARCHAR2(32)
);
-- Add comments to the table 
comment on table T_SYSTEM_ROLE_PERMISSION is '角色权限表';
-- Add comments to the columns 
comment on column T_SYSTEM_ROLE_PERMISSION.id is '表id';
comment on column T_SYSTEM_ROLE_PERMISSION.rid is '角色表id';
comment on column T_SYSTEM_ROLE_PERMISSION.pid is '权限表id';




  