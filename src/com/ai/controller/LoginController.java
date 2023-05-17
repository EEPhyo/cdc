package com.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ai.model.User;
import com.ai.persistant.dao.UserDao;
import com.ai.persistant.dto.UserDto;


@Controller
public class LoginController {
	@Autowired
	private UserDao dao;
	
	@RequestMapping(value="/loginProcess",method=RequestMethod.POST) 
	public String loginProcess(@RequestParam(value="error",required=false)String error,
			@RequestParam(value="logout",required=false)String logout,Model model) {
		
		if(error != null)
			model.addAttribute("error","Invalid username and Password");
		
	
		if(logout != null)
			model.addAttribute("logout","You have logged out successfully");
		
		return "login";
		
	}
		
		
		
			
			
}
