package com.todolist.member.mapper;

import java.util.List;

import com.todolist.member.vo.MemberVO;

public interface MemberMapper {

	public List<MemberVO> list() throws Exception;
	
}
