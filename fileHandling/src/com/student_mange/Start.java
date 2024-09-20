package com.student_mange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to student management app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to Add student");
			System.out.println("press 2 to Delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add student
				System.out.println("Enter student name:");
				String name=br.readLine();
				
				System.out.println("Enter student phone:");
				String phone=br.readLine();
				
				System.out.println("Enter Student city:");
				String city=br.readLine();
				
				//create student object to store student
				Student stud=new Student(name,phone,city);
				
				boolean ans=StudentDao.insertStudentToDB(stud);
				if(ans) {
					System.out.println("Student data is sucessfully added into database..");
				}
				else {
					System.err.println("something went wrong try again !!");
				}
				System.out.println(stud);
			}
			else if(c==2) {
				//delete student
				System.out.println("Enter Student id to delete:");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted...");
				}
				else {
					System.err.println("something went wrong try again...");
				}
				
			}
			else if(c==3) {
				//display student
				System.out.println("Enter student Id to display:");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.showAllStudent();
				
				
			}
			else if(c==4) {
				//exit
				break;
			}
			else {
				
			}
		}
		System.out.println("Thank you for using my application");
		
	}

}
