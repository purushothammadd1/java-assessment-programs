package com.module2.files.cabcustomer;

import java.sql.SQLException;
import java.util.Scanner;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("id");
				int id = sc.nextInt();
				System.out.println("Name");
				String name =sc.next();
				System.out.println("phone");
				long phone = sc.nextLong();
				CabCustomerService ccs = new CabCustomerService("cab_customer");
				CabCustomer c = new CabCustomer(id, name, phone);
				ccs.addCabCustomer(c);
				System.out.println(ccs);
				System.out.println("Type x to exit, anything else to continue: ");
				String dontStop =sc.next();
				if(dontStop.equalsIgnoreCase("x"))
					break;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
}
