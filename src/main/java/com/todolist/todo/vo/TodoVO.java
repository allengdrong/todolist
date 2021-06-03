package com.todolist.todo.vo;

import java.util.Date;

import lombok.Data;

@Data
public class TodoVO {

	private Long no;
	private Long projectNo;
	private String inviteName;
	private String title;
	private String content;
	private Date startDate;
	private Date endDate;
	private Long checkNo;
	private String alarm;
	
}
