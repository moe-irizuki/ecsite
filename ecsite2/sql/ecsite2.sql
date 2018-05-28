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
	product_id int,
	item_name varchar(30),
	image varchar(100),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);

/* カート情報テーブル */
drop table if exists cart_info;

create table cart_info(
	id int not null primary key auto_increment,
	user_id varchar(16),
	temp_user_id varchar(128) not null,
	product_id int not null,
	product_count int not null,
	price int not null,
	insert_date datetime not null,
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

INSERT INTO item_info_transaction(product_id,item_name,image,item_price,item_stock) VALUES
(0,"COFFEE BEENS1","./images/coffee1.jpg",700,50),
(1,"COFFEE BEENS2","./images/coffee2.jpg",1000,50),
(2,"COFFEE BEENS3","./images/coffee3.jpg",1200,50),
(3,"COFFEE BEENS4","./images/coffee4.jpg",1500,50),
(4,"COFFEE CUP1","./images/coffeeCup1.jpg",1000,50),
(5,"COFFEE CUP2","./images/coffeeCup2.jpg",1200,50),
(6,"COFFEE CUP3","./images/coffeeCup3.jpg",1500,50),
(7,"COFFEE CUP4","./images/coffeeCup4.jpg",2000,50),
(8,"COFFEE Maker","./images/coffeeMaker.jpg",5000,50),
(9,"COFFEE Mill","./images/coffeeMill.png",2000,50),
(10,"SIPHON","./images/siphon.jpg",1200,50),
(11,"COFFEE STARTER SET","./images/coffeeSet.jpg",3000,50);

INSERT INTO login_user_transaction(login_id,login_pass,user_name,user_address,user_gender,user_tell,user_mail) VALUES
("internous","internous01","master","tokyo","man","09000000000","master@gmail"),
("taro","123","taro123","tokyo","man","09012345678","taro@gmail");