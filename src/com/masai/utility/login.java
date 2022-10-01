package com.masai.utility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
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
			
		 		System.out.println("Welcome customer :"+student.getName());
		 		String message = "Not booked..";
				
				try(Connection conn= DBUtil.provideConnection()) {
					
					 System.out.println("Enter no of seats you want to book:");
				 		int n = sc.nextInt();
				 		for(int i = 0; i<n; i++) {
				 			
				 			 Statement stmt = conn.createStatement();
							 ResultSet rs = stmt.executeQuery("select count(*) from delexp");
							 
							 rs.next();
						      int count = rs.getInt(1);
						      System.out.println(count);
						     
					 if(count<12) {
					 
						System.out.println("Enter customername:");
				 		String cname = sc.next();
				 		
				 		System.out.println("Enter mobile:");
				 		String mobile = sc.next();
				 		
					   PreparedStatement ps = conn.prepareStatement("insert into delexp values(?,?,?)");
			            
		                ps.setString(1, null);
			            ps.setString(2, cname);
			            ps.setString(3, mobile);
					
					int x= ps.executeUpdate();
					
					if(x > 0)
						message = "seat booked!";
					System.out.println(message);
					 }else {
						 
						 System.out.println("Seat Not Avaible;");
						 break;
					 }
				 		}
				} catch (SQLException e) {
					message = e.getMessage();
				}
					
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
////			
//			

	}

}
