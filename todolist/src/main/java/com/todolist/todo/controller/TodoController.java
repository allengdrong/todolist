package com.todolist.todo.controller;

import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.todolist.todo.service.TodoService;
import com.todolist.todo.vo.TodoVO;

import lombok.extern.log4j.Log4j;

// 자동 생성 - @Controller, @Service, @Repository, @Component, @RestController,
// @~~Advice -> component-scan 설정 : servlet-context.xml, root-context.xml
@Controller
@RequestMapping("/todo")
@Log4j
public class TodoController {
	
	private final String MODULE = "todo";
	
	// 자동 DI
	@Autowired
	@Qualifier("tsi")
	private TodoService service;
	
	// 1. 게시판 리스트 - 검색 / list.do - get
	@GetMapping("/list.do")
	// @ModelAttribute - 전달 받은 변수의 값을 model에 담아서 JSP까지 보내준다. 변수 이름으로 사용
	public String list(Model model) throws Exception {
		log.info("list() - 투두 게시판 리스트 --------------");
		model.addAttribute("list", service.list());
		
		return MODULE + "/list";
	}

}
