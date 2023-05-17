package com.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ai.model.User;
import com.ai.persistant.dao.UserDao;
import com.ai.persistant.dto.UserDto;


@Controller
public class RegistrationController {
	@Autowired
	private UserDao dao;
	
	@RequestMapping(value ="/register",method=RequestMethod.GET)
	public ModelAndView showRegister(ModelMap m) {
		ModelAndView mav = new ModelAndView("register");
		 mav.addObject("bean",new User());		
		return mav;
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST) 
	public String registerProcess(@ModelAttribute("bean") @Validated User user,BindingResult bs,ModelMap model) {
		if(bs.hasErrors()) {
		return "register";
		}
		
		UserDto dto = new UserDto();
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setPhone_number(user.getPhone_number());
		dto.setAddress(user.getAddress());		
		int rs = dao.insertData(dto);
		
		if(rs ==0) {
			model.addAttribute("error","Registration Failed");
			return "register";
		}
		
		return "dashboard";
			
	}	
	
}
