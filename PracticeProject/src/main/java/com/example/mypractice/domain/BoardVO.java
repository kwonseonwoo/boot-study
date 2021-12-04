package com.example.mypractice.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private int board_no;
	private String board_title;
	private String board_content;
	private Date board_regDate;
}
