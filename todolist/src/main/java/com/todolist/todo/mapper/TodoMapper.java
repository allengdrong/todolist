package com.todolist.todo.mapper;

import java.util.List;

import com.todolist.todo.vo.TodoVO;

public interface TodoMapper {
	
	// 1. 게시판 리스트
	public List<TodoVO> list();

}
