package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class SpringHibernateDao extends HibernateDaoSupport {

	    public void save(Object entity) {
	    	System.out.println("springHibernatedao来了");
	    	
		    super.getHibernateTemplate().save(entity);
		 
	    }
//	    
//	    public void save(T_User entity) {
//	    	System.out.println("springHibernatedao来了");
//	    	System.out.println(entity.getUserName()+"sprinthibernate用户名");
//		    super.getHibernateTemplate().save(entity);
//		 
//	    }
	
}
