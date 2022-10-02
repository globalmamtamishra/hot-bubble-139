import java.util.*;

import com.masai.utility.login;

import usecases.customer_reg;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ; Register as customer");
		
		System.out.println("2 ; Login as customer");
		
		int n = sc.nextInt();
		
		if(n==1) {
			customer_reg.main(args);
		}
		else if(n==2) {
			login.main(args);
		}
		else {
			System.out.println("Wrong input:");
			main(args);
		}
	}

}
