package com.masai.dao;

import java.util.List;
import com.masai.bean.Bus;
import com.masai.bean.customer;
import com.masai.exception.customerexception;


public interface customerDao {
	
//	public String registerCustomer(int id,String name, String email, String pass, String mob, String add);

	public String registerCustomer(int cid, String name, String email, String pass, String mob, String add);
	
	public customer loginCustomer(String username, String password) throws customerexception;
	
	public String registeBus(int bid, String bname, String broute, String btype, int seat, String atime, String dtime, String date);
	
	public List<Bus> getAllBusDetails()throws Exception;

}
