package com.action;

import com.bean.T_User;
import com.bean.UserForm;
import com.dao.SpringHibernateDao;
import com.opensymphony.xwork2.ActionSupport;
public class UserAction extends ActionSupport {

	 private static final long serialVersionUID = 1L;  
	private UserForm user;
	//private UserManaer userManaer;
	private String userName;
	private String passWord;
	private SpringHibernateDao shdao;
	public SpringHibernateDao getShdao() {
		return shdao;
	}

	public void setShdao(SpringHibernateDao shdao) {
		this.shdao = shdao;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public UserForm getUser() {
		return user;
	}
//	public UserManaer getUserManaer() {
//		return userManaer;
//	}
//	public void setUser(UserForm user) {
//		this.user = user;
//	}
//	public void setUserManaer(UserManaer userManaer) {
//		this.userManaer = userManaer;
//	}
	
	public String execute(){
		System.out.println("action”√ªß√˚"+userName);
		System.out.println("action√‹¬Î"+passWord);
		try {
			//this.setUserManaer(new UserManagerImpl());
			T_User us = new T_User();
			//hibernateDao hb = new hibernateDao();
			//SpringHibernateDao shd = new SpringHibernateDao();
			//us.setId(10);
			us.setUserName(userName);
			us.setPassWord(passWord);
			shdao.save(us);
			return SUCCESS;
//			boolean num = hb.add(us);
//			if(num){
//				return SUCCESS;
//			}
//			else {
//				return ERROR;
//			}
			//userManaer.regUser(user);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		return ERROR;
			
		}
		
	}
	
}
