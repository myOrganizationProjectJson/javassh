package com.pb.biz.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.pb.dao.IUserDao;
import com.pb.entity.User;
import com.pb.web.action.BaseAction;

public class woyaoceshi<T> extends BaseAction {
	private HibernateTemplate hibernateTemplate;
	//private SessionFactory sessionFactory;
	private SessionFactory sessionFactory;
	private IUserDao dao;  
	  
	public void setQuartzSssionFactory(SessionFactory sessionFactory) {  
	        this. sessionFactory = sessionFactory;  
	}  
	public String ceshi() {
		System.out.println("======================");
	//	System.out.println(findByProperty("username", "admin"));
		//findByProperty("username", "admin");
		System.out.println("======================");
		return SUCCESS;
		
	}
	
}
