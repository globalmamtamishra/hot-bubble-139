package usecases;

import java.util.Scanner;

import com.masai.dao.customerDao;
import com.masai.dao.customerDaoImpl;

public class customer_reg {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter id");
        int cid = sc.nextInt();
       System.out.println("enter name");
        String name = sc.next();
        System.out.println("enter email");
        String email = sc.next();
        System.out.println("enter password");
        String pass = sc.next();
        System.out.println("enter mobile");
        String mob = sc.next();
        System.out.println("enter address");
        String add = sc.next();
       
        
       customerDao dao= new customerDaoImpl();
       String result= dao.registerCustomer(cid, name, email, pass, mob, add);
		
		
		
		System.out.println(result);

	}

}
