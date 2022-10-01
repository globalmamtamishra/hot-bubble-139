package com.masai.utility;
import java.util.List;
import com.masai.bean.Bus;
import com.masai.dao.customerDao;
import com.masai.dao.customerDaoImpl;

public class getallbus {
	
	public static void main(String[] args) {
		
		customerDao dao = new customerDaoImpl();
		
		try {
		List<Bus> students= dao.getAllBusDetails();
		
		students.forEach(s ->{
			
			System.out.println(s);
			
			System.out.println("=======================");
		});
		
		}catch(Exception se) {
			System.out.println(se.getMessage());
		}	
	}
}

