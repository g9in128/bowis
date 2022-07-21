package com.bowis.home.model;

//CREATE TABLE `member` (
//		  `memberNum` int NOT NULL,
//		  `email` varchar(40) NOT NULL,
//		  `memberId` varchar(25) NOT NULL,
//		  `password` varchar(25) NOT NULL,
//		  `salt` char(10) NOT NULL,
//		  `name` varchar(25) NOT NULL,
//		  `monE` int NOT NULL,
//		  `image` varchar(16) NOT NULL,
//		  PRIMARY KEY (`memberNum`,`email`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


import lombok.Data;

@Data
public class MemberDTO {
	int memberNum;
	String email;
	String memberId;
	String password;
	String salt;
	String name;
	int monE;
	String image;
}
