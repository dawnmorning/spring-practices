package com.poscodx.emaillist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscodx.emaillist.repository.EmailListRepository;

@Controller
public class EmaillistController {
	
	@Autowired // Root Application context에서 wire 해옴
	private EmailListRepository emailListRepository;
	@ResponseBody
	@RequestMapping("/")
	public String main() {
		emailListRepository.findAll();
		return "ok!";
	}
}
