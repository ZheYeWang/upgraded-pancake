package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class SpringHibernateDao extends HibernateDaoSupport {

	    public void save(Object entity) {
	    	System.out.println("springHibernatedao����");
	    	
		    super.getHibernateTemplate().save(entity);
		 
	    }
//	    
//	    public void save(T_User entity) {
//	    	System.out.println("springHibernatedao����");
//	    	System.out.println(entity.getUserName()+"sprinthibernate�û���");
//		    super.getHibernateTemplate().save(entity);
//		 
//	    }
	
}
