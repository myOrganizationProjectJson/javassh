package com.pb.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.pb.biz.IUserBiz;
import com.pb.entity.User;
import com.pb.entity.Verified;

public class UserAction extends BaseAction {
	private IUserBiz biz;
	private String username;
	private String password;
	private String sb;
	private String tip;
	private HibernateTemplate hibernateTemplate;
	private PlatformTransactionManager ptm;
	private DefaultTransactionDefinition dtd;
	
	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public void setBiz(IUserBiz biz) {
		this.biz = biz;
	}

	/**
	 * 用户登录
	 * 
	 * @return
	 */
	public String login() {
		System.out.println(sb+"sbmeiyou...");
		System.out.println(username+"logining");
		Map<String, Object> map=biz.login(username, password); // 用户登录
		if(map.get("user")!=null){
			session.put("user", map.get("user")); // 用户登陆成功
		}else{
			// 用户登录失败
			if(map.get("pwd_error")!=null){
				this.setTip(String.valueOf(map.get("pwd_error")));
			}else if(map.get("no_user")!=null){
				this.setTip(String.valueOf(map.get("no_user")));
			}
			return ERROR;
		}
		return SUCCESS;
	}
	
	/**
	 * 通过IOC方式注入SessionFactory
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory){
		// 实例化HibernateTemplate对象
		hibernateTemplate =new HibernateTemplate(sessionFactory);
	}
	/**
	 * 通过IOC方式注入ptm
	 * @param ptm
	 */
	public void setPtm(PlatformTransactionManager ptm) {
		this.ptm=ptm;
		// 实例化默认事务定义
		dtd=new DefaultTransactionDefinition();
		// 设置传播特性
		dtd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
	}
	
	
	@Test
	public Verified test(){
		//List<Verified> list = new ArrayList<Verified>();
		try {
			// 定义查询语句
			final String queryString = "from Verivied as model";
			System.out.println("1111111");
		    hibernateTemplate.execute(new HibernateCallback()
		       {
		           public Object doInHibernate(Session session)
		                  throws HibernateException
		           {
		        	   List list= session.createQuery(queryString).list();
		        	   System.out.println(list);
		        	   return list;
		           }

		       });
			
		//list=hibernateTemplate.find(queryString,new Object[]{value});
			//User user=(User) list.get(0); 
			//System.out.println(user.getPassword());
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return test();
	}
	
	public String ceshiss() {
		System.out.println();
		return SUCCESS;
	}
}
