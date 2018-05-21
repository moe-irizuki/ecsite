set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite3;

create database if not exists ecsite3;
use ecsite3;

/* ユーザーログイン情報テーブル */

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	user_address varchar(50),
	user_gender varchar(10),
	user_tell varchar(13),
	user_mail varchar(50),
	insert_date datetime,
	update_date datetime
);

/* 商品情報テーブル */

drop table if exists item_info_transaction;

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_name varchar(30),
	image varchar(100),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);

/* 商品購入テーブル */

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);

/* 問い合わせテーブル */

drop table if exists inquiry_transaction;

create table inquiry_transaction(
	inquiry_name varchar(50),
	inquiry_mail varchar(50),
	qtype varchar(50),
	body varchar(225),
	master_id varchar(50)
	);

INSERT INTO item_info_transaction(item_name,image,item_price,item_stock) VALUES
("RIP CREAM","./images/ripcream1.jpg",100,50),
("BODY CREAM","./images/bodycream.jpg",500,50),
("HAIR OIL","./images/hairoil.jpg",1000,50),
("PERFUME","./images/perfume.jpg",700,30);

INSERT INTO login_user_transaction(login_id,login_pass,user_name,user_address,user_gender,user_tell,user_mail) VALUES
("internous","internous01","master","tokyo","man","09000000000","master@gmail"),
("taro","123","taro123","tokyo","man","09012345678","taro@gmail");