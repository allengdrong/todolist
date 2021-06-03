package com.todolist.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todolist.member.mapper.MemberMapper;
import com.todolist.member.vo.MemberVO;

@Service
@Qualifier("tli")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public List<MemberVO> list() throws Exception {
		// TODO Auto-generated method stub
		
		return mapper.list();
		
	}

}
