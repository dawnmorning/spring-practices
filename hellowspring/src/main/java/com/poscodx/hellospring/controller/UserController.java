package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping 클래스 + 메서드 매핑
 * 강 
 */

@RequestMapping("/user")
@Controller
public class UserController {
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String join(UserVo userVo) {
		System.out.println("UserController.join(): UserDao.insert(" + userVo + ")");
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	/*
	 * 만약 n이라는 이름의 url 파라미터가 없으면
	 * 400 bad request 에러가 난다.
	 */
	public String update(@RequestParam("n") String name) {
		return "UserController.update(" + name + "))";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required = true, defaultValue = "") String name) {
		return "UserController.update(" + name + ")";
	}
	@ResponseBody
	@RequestMapping("/list")
	public String list(@RequestParam(value="p", required = true, defaultValue = "1") int pageNo) {
		return "UserController.update(" + pageNo + ")";
	}
}