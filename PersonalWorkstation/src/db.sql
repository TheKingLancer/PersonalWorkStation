drop table user_login ;
create table user_login (
id varchar(50)  primary key,
email varchar(50) not null unique,
password varchar(50) not null,
verify boolean
)engine=innodb default charset=utf8;

drop table user_info ;
create table user_info (
id varchar(50)  primary key,
userid varchar(50) not null,
nickname varchar(50) default null,
birthday varchar(50) default null,
sex int default 0,
personalized_signature varchar(200) default null,
head_portrait_path varchar(200) default null
)engine=innodb default charset=utf8;


drop table user_account_info;
create table user_account_info (
id varchar(50)  primary key,
userid varchar(50) not null,
birthday varchar(50) default null,
pv int default 0,
article_amount int default 0,
message_amount int default 0
)engine=innodb default charset=utf8;
