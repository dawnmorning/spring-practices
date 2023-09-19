package com.poscodx.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poscodx.emaillist.repository.EmailListRepository;
import com.poscodx.emaillist.vo.EmailListVo;

@Controller
public class EmaillistController {
	
	@Autowired // Root Application context에서 wire 해옴
	private EmailListRepository emailListRepository;
	@RequestMapping("/")
	public String main(Model model) {
		List<EmailListVo> list = emailListRepository.findAll();
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add() {
		return "add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(EmailListVo vo) {
		emailListRepository.insert(vo);
		return "redirect:/";
	}
	
}
