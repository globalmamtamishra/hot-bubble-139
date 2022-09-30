package com.masai.utility;
import java.util.Scanner;

import com.masai.bean.customer;
import com.masai.dao.customerDao;
import com.masai.dao.customerDaoImpl;
import com.masai.exception.customerexception;

public class login{

	public static void main(String[] args) {
			
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Username:");
			String uname = sc.next();
			
			System.out.println("Enter Password:");
			String pass = sc.next();
			
			customerDao dao = new customerDaoImpl();
			
			try {
				customer student= dao.loginCustomer(uname, pass);
			
		 		System.out.println("Welcome Student :"+student.getName());
		 	
		 	
			}catch (customerexception e) {
				System.out.println(e.getMessage());
			}
			
			

	}

}
