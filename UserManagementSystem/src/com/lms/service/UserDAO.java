package com.lms.service;

public interface UserDAO {

	void addRegister();
	boolean verifyUserNameAndLogin(String uname,String pass);
}
