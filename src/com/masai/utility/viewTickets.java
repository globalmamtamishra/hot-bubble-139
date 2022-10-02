package com.masai.utility;

import java.util.List;


import com.masai.bean.ticket;
import com.masai.dao.customerDao;
import com.masai.dao.customerDaoImpl;

public class viewTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
customerDao dao = new customerDaoImpl();
		
		try {
		List<ticket> students= dao.tickerDetails();
		
		students.forEach(s ->{
			
			System.out.println(s);
			
			System.out.println("=======================");
		});
		
		}catch(Exception se) {
			System.out.println(se.getMessage());
		}	

	}

}
