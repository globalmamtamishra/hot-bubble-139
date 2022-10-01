package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.masai.bean.Bus;
import com.masai.bean.customer;
import com.masai.exception.customerexception;
import com.masai.utility.DBUtil;

public class customerDaoImpl implements customerDao{


	@Override
		public String registerCustomer(int id,String name, String email, String pass, String mob, String add) {
			String message = "Not Inserted..";
		
			try(Connection conn= DBUtil.provideConnection()) {
				
				   PreparedStatement ps = conn.prepareStatement("insert into Customer values(?,?,?,?,?,?)");
		            
	                ps.setInt(1, id);
		            ps.setString(2, name);
		            ps.setString(3, email);
		            ps.setString(4, pass);
		            ps.setString(5, mob);
		            ps.setString(6, add);
				
				int x= ps.executeUpdate();
				
				
				if(x > 0)
					message = "Customer Registered Sucessfully !";
				
				
			} catch (SQLException e) {
				message = e.getMessage();
			}
			return message;
		}

	
	
	public String registeBus(int bid, String bname, String broute, String btype, int seat, String atime, String dtime, String date) {
		
			String message = "Not Inserted..";
		
			try(Connection conn= DBUtil.provideConnection()){
				
				 PreparedStatement ps = conn.prepareStatement("insert into Bus values(?,?,?,?,?,?,?,?)");

		            ps.setInt(1, bid);
		            ps.setString(2, bname);
		            ps.setString(3, broute);
		            ps.setString(4, btype);
		            ps.setInt(5, seat);
		            ps.setString(6, atime);
		            ps.setString(7, dtime);
		            ps.setString(8, date);

		        	int x= ps.executeUpdate();
					
					
					if(x > 0)
						message = "bus Registered Sucessfully !";
					
					
				} catch (SQLException e) {
					message = e.getMessage();
				}
				return message;
		        
			}
				
	
//		@Override
//		public Student getStudentByRoll(int roll)throws StudentException {
//		
//			Student student =null;
//			
//			
//			try (Connection conn= DBUtil.provideConnection()){
//				
//				PreparedStatement ps= conn.prepareStatement("select * from student where roll=?");
//				
//				
//				ps.setInt(1, roll);
//				
//				ResultSet rs= ps.executeQuery();
//				
//				if(rs.next()) {
//					
//					int r= rs.getInt("roll");
//					String n= rs.getString("name");
//					int m= rs.getInt("marks");
//					String e= rs.getString("email");
//					String p= rs.getString("password");
//					
//					
//				student=new Student(r, n, m, e, p);	
//					
					
//				}else
//					throw new StudentException("Student does not exist with roll "+roll);
//				
//				
//				
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//				
//				throw new StudentException(e.getMessage());
//				
//				
//			}
//			
		
//		
//		
//			return student;
//		
//		}

		@Override
		public customer loginCustomer(String username, String password) throws customerexception {
			
			
			customer student = null;
			
			try(Connection conn = DBUtil.provideConnection()) {
				
				
				PreparedStatement ps= conn.prepareStatement("select * from customer where cemail = ? AND cpass = ?");			
				
				ps.setString(1, username);
				ps.setString(2, password);
				
				ResultSet rs= ps.executeQuery();
				
				
					if(rs.next()) {
					
					int i= rs.getInt("cid");
					String n= rs.getString("cname");
					String e= rs.getString("cemail");
					String p= rs.getString("cpass");
					String m= rs.getString("mobile");
					String a= rs.getString("address");
					
					
				student=new customer(i, n, e, p, m, a);	
					
					
				}else
					throw new customerexception("Invalid Username or password.. ");
				
				
			} catch (SQLException e) {
				throw new customerexception(e.getMessage());
			}
			
	return student;	
		}

		@Override
		public List<Bus> getAllBusDetails() throws Exception {
			
			List<Bus> bus =  new ArrayList<>();
			
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps= conn.prepareStatement("select * from Bus");
				
				
				
				ResultSet rs= ps.executeQuery();
				
				while(rs.next()) {
					
					
					int bn= rs.getInt("busNo");
					String n= rs.getString("busName");
					String r= rs.getString("busRoute");
					String t= rs.getString("busType");
					int s= rs.getInt("seat");
					String dt= rs.getString("departuretime");
					String at= rs.getString("arrivalTime");
					String d= rs.getString("date");
					
					
				Bus b =new Bus(bn, n, r, t, s, dt, at, d);
					
				bus.add(b);
			
				}
				
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			}
			
			
			if(bus.size() == 0)
				throw new Exception("No bus found..");
				
			return bus;
		}
		
	

//		@Override
//		public String registerStudentInsideACourse(int cid, int roll) throws StudentException, CourseException {
//			
//				String message ="Not Resgistered";
//		
//		
//				try(Connection conn= DBUtil.provideConnection()) {
//					
//				 	PreparedStatement ps= conn.prepareStatement("select * from customer where cid =?");
//					
//				 	
//				 	ps.setInt(1, roll);
//				 	
//				 	ResultSet rs= ps.executeQuery();
//					
//				 	if(rs.next()) {
//				 		
//				 		PreparedStatement ps2= conn.prepareStatement("select * from bus where busNo =?");
//				 		
//				 		ps2.setInt(1, cid);
//
//				 		ResultSet rs2= ps2.executeQuery();
//				 		
//				 		if(rs2.next()) {
//				 			
//		
//				 			PreparedStatement ps3= conn.prepareStatement("insert into course_student values(?,?)");
//				 			
//				 			
//				 			ps3.setInt(1, cid);
//				 			ps3.setInt(2, roll);
//				 			
//				 			int x= ps3.executeUpdate();
//				 			
//				 			if(x > 0)
//				 				message = "Student registered inside the Course Sucessfully.. ";
//				 			else
//				 				throw new Exception("Techical error..");
//				 		}
//				 		else
//				 			throw new Exception("Invalid Course...");
//				 		
//				 	}else
//				 		throw new Exception("Invalid Student...");	
//					
//				} catch (SQLException e) {
//					throw new Exception(e.getMessage());
//				}
//				
//				return message;
//		}

//		@Override
//		public List<StudentDTO> getAllStudentsByCname(String cname) throws CourseException {
//			
//			
//			List<StudentDTO> dtos = new ArrayList<>();
			
			
			
//			try (Connection conn = DBUtil.provideConnection()){
//				
//				PreparedStatement ps= conn.prepareStatement("select s.roll, s.name,s.email, c.cname, c.fee "
//															+ "from  student s INNER JOIN course c INNER JOIN course_student cs "
//															+ "ON s.roll = cs.roll AND c.cid = cs.cid AND c.cname= ?");
//				
//				ps.setString(1, cname);
//				
//				ResultSet rs= ps.executeQuery();
//				
//				while(rs.next()) {
//					
//					int r= rs.getInt("roll");
//					String sn= rs.getString("name");
//					String em= rs.getString("email");
//					
//					String cn= rs.getString("cname");
//					int f= rs.getInt("fee");
//					
//					StudentDTO dto = new StudentDTO(r, sn, em, cn, f);
//					
//					dtos.add(dto);
//					
//					
//					
//				}
//				
				
				
				
//				
//				
//			} catch (SQLException e) {
//				throw new CourseException(e.getMessage());
//			}
//			
//			
//			
//			if(dtos.isEmpty())
//				throw new CourseException("No Student found in that course");
//			
//			
//			
//			
//			return dtos;
//			
//		}
//
//	}
//
//
}
