create database onlinejobportal;

show databases;

use onlinejobportal;

create table account(username varchar(20) ,emailid varchar(30),password varchar(10),conpassword varchar(10),phonenumber varchar(10));

show tables;

select * from account;

create table employee(username varchar(20),aadhaar varchar(20),emailid varchar(30),gender varchar(10),address varchar(50),phonenumber varchar(20),college varchar(20),course varchar(10));

select * from employee;

create table applyj(username varchar(20),emailid varchar(20),company  varchar(20),percentage varchar(10));

select * from applyj;

alter table applyj drop column percentage;

