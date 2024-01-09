package com.test1.SaveUser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test1.SaveUser.dao.Test1Dao;
import com.test1.SaveUser.entity.User2;

@Service
public class Test1Service {
	
	@Autowired
	Test1Dao dao ;
	
	public void registerUser (User2 user) {
		
		dao.saveUser(user);
		
	}

}
