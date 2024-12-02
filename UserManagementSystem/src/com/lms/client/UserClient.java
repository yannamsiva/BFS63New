package com.lms.client;

import java.util.Scanner;

import com.lms.service.UserDAO;
import com.lns.service.impl.UserDAOImpl;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		UserDAO daoImpl = new UserDAOImpl();
		while (true) {
			System.out.println("==================================================================================");

			System.out.println("            1)Register                                                              ");
			System.out.println("            2)Login                                                              ");
			System.out.println("            3)Exit                                                              ");

			System.out.println("==================================================================================");

			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addRegister();
				break;
			case 2:
				System.out.println("Enter User Name");
				String uname = sc.next();
				System.out.println("Enter passWord");
				String pass = sc.next();
				boolean flag = daoImpl.verifyUserNameAndLogin(uname, pass);

				if (flag)
					System.out.println("Login Succesffully");
				else
					System.out.println("Invalid UserName/Password");

				break;
			case 3:
				System.out.println("Thx for App!");
				System.exit(0);

			default:
				System.out.println("Choose 1 to 3 between");

			}// end fo switch

		} // end of while

	}

}
