package com.bowis.home.model;

//create table member (
//		memberNum int primary key,
//	    memberId varchar(25) not null,
//	    password varchar(25) not null,
//	    salt char(10) not null,
//	    name varchar(25) not null,
//	    monE int not null,
//	    image varchar(16) not null
//	);

import lombok.Data;

@Data
public class MemberDTO {
	int memberNum;
	String memberId;
	String password;
	String salt;
	String name;
	int monE;
	String image;
}
