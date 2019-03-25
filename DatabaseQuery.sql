create database SteamDatabase

create table Account
(
	[username] varchar(32) primary key,
	[password] varchar(32),
	[guestName] varchar(40),
	[dateOfBirth] date,
	[email] varchar(32),
	[gender] varchar(7) CHECK(gender='Male' or gender = 'Female'),
	[money] int,
	[createdDate] date,
	[ingameName] varchar(32),
)

create table Game
(
	[id] int primary key not null,
	[name] varchar(50) not null,
	[price] int not null,
	[developer] varchar(30) not null,
	[onSale] int,
	[genres] varchar(60) --split genres by ","
)

create table SellLog
(
	[logID] varchar(40) primary key,
	[username] varchar(32),
	[idGame] int,
	[boughtDate] date,
	[email] varchar(40),
	[price] int
	FOREIGN KEY (username) REFERENCES Account(username),
	FOREIGN KEY (idGame) REFERENCES Game(id)
)

create table WalletLog
(
	[logID] varchar(40) primary key,
	[username] varchar(32),
	[money] int check(money>0),
	[paidDate] date,
	FOREIGN KEY (username) REFERENCES Account(username)
)

USE master
drop database SteamDatabase