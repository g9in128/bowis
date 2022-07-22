package com.bowis.home.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

//CREATE TABLE `member` (
//		  `memberNum` bigint NOT NULL,
//		  `email` varchar(40) NOT NULL,
//		  `memberId` varchar(25) NOT NULL,
//		  `password` varchar(60) NOT NULL,
//		  `name` varchar(25) NOT NULL,
//		  `monE` int NOT NULL,
//		  `profileImage` varchar(20) NOT NULL,
//		  PRIMARY KEY (`memberNum`,`email`)
//		) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


@Data
public class MemberDTO {
	long memberNum;
	String email;
	String memberId;
	String password;
	String name;
	int monE;
	String profileImage;
	String default_profile;
	MultipartFile image;
	
}
