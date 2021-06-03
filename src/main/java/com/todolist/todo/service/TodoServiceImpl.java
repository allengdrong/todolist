package com.todolist.todo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todolist.todo.mapper.TodoMapper;
import com.todolist.todo.vo.TodoVO;

import lombok.extern.log4j.Log4j;

// 자동 생성
@Service
// 타입이 같은 객체들이 많은경우
//
@Qualifier("tsi")
@Log4j
public class TodoServiceImpl implements TodoService {
	
	@Inject
	private TodoMapper mapper;
	
	@Override
	public List<TodoVO> list() throws Exception {
		// TODO Auto-generated method stub
		log.info("list() - 투두 리스트 서비스 실행 ************** ");
		return mapper.list();
	} 


}
