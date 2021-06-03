package com.todolist.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todolist.member.vo.MemberVO;

@Service
public interface MemberService {
	
	public List<MemberVO> list() throws Exception;

}
