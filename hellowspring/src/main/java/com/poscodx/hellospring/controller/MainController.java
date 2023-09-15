package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	// 해당 url에 body부분에 담아 보낼 값
	@ResponseBody
	@RequestMapping({"/","/main"})
	public String main() {
		return "MainController.main()";
	}
}
