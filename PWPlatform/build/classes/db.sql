use personalworkstation;

--用户表
drop table if exists user;
create table user(
id varchar(50)  primary key,
create_time varchar(50) not null,
email varchar(50) not null unique,
password varchar(50) not null,
user_group int not null,
verify boolean
)engine=innodb default charset=utf8;

--用户信息表
drop table if exists user_info ;
create table user_info (
id varchar(50)  primary key,
userid varchar(50) not null,
update_time varchar(50) not null,
nickname varchar(50) default null,
birthday varchar(50) default null,
sex int default 0,
personalized_signature varchar(200) default null,
head_portrait_path varchar(200) default null
)engine=innodb default charset=utf8;

--用户统计信息表
drop table if exists user_account_info;
create table user_account_info (
id varchar(50)  primary key,
userid varchar(50) not null,
update_time varchar(50) not null,
pv int default 0,
article_amount int default 0,
message_amount int default 0
)engine=innodb default charset=utf8;

--好友表
drop table if exists user_friend;
create table user_friend (
id varchar(50)  primary key,
userid varchar(50) not null,
friend_userid varchar(50) not null,
create_time varchar(50) not null,
friend_group_id varchar(50) not null,
remark varchar(50) not null,
state int not null,
)engine=innodb default charset=utf8;

--好友分组
drop table if exists friend_group;
create table friend_group(
id varchar(50) primary key,
user_id varchar(50) not null,
group_name varchar(50),
create_time varchar(50) not null
)engine=innodb default charset=utf8;

--用户任务表
drop table if exists user_task;
create table user_task(
id varchar(50) primary key,
userid varchar(50) not null,
task_content varchar(50) not null,
task_date varchar(50) not null,
task_remind_time varchar(50),
remark varchar(50),
task_status int not null
)engine=innodb default charset=utf8;
