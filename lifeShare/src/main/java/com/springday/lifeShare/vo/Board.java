package com.springday.lifeShare.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class Board {
	
	private int bid; 
	private String uid;
	private String btype;
	private String category;
	private String loc;
	private String loc2;
	private String content;
	private int likes;
	private int views;
	private MultipartFile imgFile;
	private Date time_of_upload;

}
