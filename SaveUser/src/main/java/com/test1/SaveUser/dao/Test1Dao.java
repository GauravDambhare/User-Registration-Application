package com.test1.SaveUser.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test1.SaveUser.entity.User2;

@Repository
public class Test1Dao {
	
	@Autowired
	SessionFactory sessonfactory ;
	
	public void saveUser (User2 user ) {
		Session openSession = sessonfactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(user);
		beginTransaction.commit();
	}

}
