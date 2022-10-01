package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the delexp seat to cancle :");
		int seat= sc.nextInt();
		
		
String url = "jdbc:mysql://localhost:3306/superfast";
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "MaM@1995")) {

			
			
		
		PreparedStatement ps= conn.prepareStatement("delete from delexp where seat = ?");
		 	
		ps.setInt(1, seat);	
		
		int x= ps.executeUpdate();	
		 
		if(x > 0)
			System.out.println(x + " cancle ticket  Sucessfully");
		else
			System.out.println("Record does not exist.");
		 
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
