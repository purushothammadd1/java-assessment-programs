package com.emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity;
	private int defaultPasswordLength =10;
	private String alternateEmail;
	private String companySuffix ="NSEGroup.com";

	//constructors to revice for firstname and lastname
	public Email() {

	}
	public Email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Email created: "+this.firstname+ " "+this.lastname);

		//call a method asking for the department = return the department
		this.department=setDepartment();
		System.out.println("Department: "+this.department);


		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		//combine elemnts to generate email
		email =firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+companySuffix;
	}

	//Ask for the department
	private String setDepartment() {
		System.out.print("Department codes: \n1 for sales \n2 for development \n3 for Accounting \n4 for none \nEnter department code:");
		Scanner sc=new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice ==1 ) {
			return "sales";
		}
		else if(depChoice == 2){
			return "development";
		}
		else if(depChoice ==3) {
			return "acctount";
		}
		else {
			return "";
		}
	}

	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password =new char[length];
		for(int i=0;i<length;i++) {
			int rand =(int)	(Math.random()*passwordSet.length());
			password[i] =passwordSet.charAt(rand);
		}
		return new String(password);
	}


	//set the mailboxcapacity


	//set the alternate email


	//change the password
}
