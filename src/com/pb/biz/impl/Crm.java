package com.pb.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.pb.dao.IUserDao;
import com.pb.web.action.BaseAction;

public class Crm<T> extends BaseAction {
//	private HibernateTemplate hibernateTemplate;
	//private SessionFactory sessionFactory;
	private SessionFactory sessionFactory;
	private IUserDao dao;  
	  
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	
	public String index() {
		System.out.println("======================");
	//	System.out.println(findByProperty("username", "admin"));
		//findByProperty("username", "admin");
		String value="1";
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		try {
			// 定义查询语句
			String queryString = "from wocaonima as model where model.id= ?";
			
//			/list=hibernateTemplate.find(queryString,new Object[]{value});
		//	System.out.println(user.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//List<Wocaonima> list = //dao.find(username!=null?username.trim():"");
		
		System.out.println("======================");
		return SUCCESS;
	}
	
}
