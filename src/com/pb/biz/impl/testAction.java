package com.pb.biz.impl;

import org.hibernate.SessionFactory;

import com.pb.dao.IUserDao;
import com.pb.web.action.BaseAction;

public class testAction<T> extends BaseAction {
//	private HibernateTemplate hibernateTemplate;
	//private SessionFactory sessionFactory;
	private SessionFactory sessionFactory;
	private IUserDao dao;  
	  
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	
	public String index() {
		System.out.println("======================");
		
		
		try {
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("======================");
		return SUCCESS;
	}
	
}
