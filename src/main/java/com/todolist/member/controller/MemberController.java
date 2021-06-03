package com.todolist.member.controller;


import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todolist.member.service.MemberService;

@Controller
@RequestMapping("/list")
public class MemberController {
	
	@Inject
	@Qualifier("tli")
	private MemberService service;
	
	@GetMapping("/list.do")
	public String list(Model model) throws Exception {
		
		model.addAttribute("list", service.list());
		
		return "list/list";
		
	}
	
}
