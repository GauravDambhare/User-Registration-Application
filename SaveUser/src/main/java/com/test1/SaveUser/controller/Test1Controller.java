package com.test1.SaveUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test1.SaveUser.entity.User2;
import com.test1.SaveUser.service.Test1Service;

@Controller
public class Test1Controller {

	@Autowired
	Test1Service service ;
	
	 @GetMapping("/register")
	public String register  () {
		
		return "register" ;
	}
	
	
	@PostMapping("saveUser")
	public String saveUser(User2 user) {
		
		service.registerUser(user);
		
		return "DataSaved" ;
		
	}
	
}
