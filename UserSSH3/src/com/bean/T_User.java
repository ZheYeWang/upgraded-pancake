package com.bean;

public class T_User {

	private int id;
	private String userName;
	private String passWord;
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		System.out.println("½øÀ´ÁËuser");
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
