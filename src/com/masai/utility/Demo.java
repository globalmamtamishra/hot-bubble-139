package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.dao.customerDao;
import com.masai.dao.customerDaoImpl;

public class Demo {
	
	public static void main(String[]args)  {
	
	Scanner sc = new Scanner(System.in);

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

        customerDao dao= new customerDaoImpl();
        String result= dao.registeBus(bno, bname, broute, bustype, seat, atime, dtime, date);
 		
 		System.out.println(result);
 		
	}
}
