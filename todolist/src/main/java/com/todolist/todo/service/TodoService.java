package com.todolist.todo.service;

import java.util.List;

import com.todolist.todo.vo.TodoVO;

public interface TodoService {

	// 1. 게시판 리스트
	public List<TodoVO> list() throws Exception;
	
}
