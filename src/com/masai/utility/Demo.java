package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

 

public class Demo {
	
	public static void main(String[]args)  {
	
	Scanner sc = new Scanner(System.in);
	

    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

    String url = "jdbc:mysql://localhost:3306/superfast";

       System.out.println("enter busNo");
        int bno = sc.nextInt();
        System.out.println("enter busname");
        String bname = sc.next();
        System.out.println("enter busRoute");
        String broute = sc.next();
        System.out.println("enter busType");
        String bustype = sc.next();
        System.out.println("enter Seat");
        int seat = sc.nextInt();
        System.out.println("enter arrivalTime");
        String atime = sc.next();
        System.out.println("enter departureTime");
        String dtime = sc.next();
        System.out.println("enter Date");
        String date = sc.next();

        try {
            Connection cc = DriverManager.getConnection(url, "root", "MaM@1995");

            PreparedStatement ps = cc.prepareStatement("insert into Bus values(?,?,?,?,?,?,?,?)");

            ps.setInt(1, bno);
            ps.setString(2, bname);
            ps.setString(3, broute);
            ps.setString(4, bustype);
            ps.setInt(5, seat);
            ps.setString(6, atime);
            ps.setString(7, dtime);
            ps.setString(8, date);

            ps.executeUpdate();
            
            System.out.println("hurray..");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
