package com.lns.service.impl;

import java.util.Scanner;

import com.lms.model.User;
import com.lms.service.UserDAO;

public class UserDAOImpl implements UserDAO {

	User addUsers[]=new User[3];
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void addRegister() {
		// TODO Auto-generated method stub

		for(int i=0;i<3;++i)
		{
		System.out.println("Enter User Id");
		int id=sc.nextInt();
		System.out.println("Enter User First Name");
		String fname=sc.next();
		System.out.println("Enter User Last Name");
		String lname=sc.next();
		System.out.println("Enter User Email");
		String email=sc.next();
		System.out.println("Enter User  Name");
		String uname=sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		
		
		User user=new User(id,fname,lname,email,uname,pass);
		
		addUsers[i]=user;
		
		System.out.println("Register Added Success Fully");
		
		}//end of for loop
		
	}

	@Override
	public boolean verifyUserNameAndLogin(String uname, String pass) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		for(User u : addUsers)
		{
			
			if(u.getUsername().equals(uname)&&u.getPassword().equals(pass))
			{
				
flag=true;
				break;
			}
			
						
		}//end of for loop
		
		
		
		
		
		
		return flag;
	}

}
