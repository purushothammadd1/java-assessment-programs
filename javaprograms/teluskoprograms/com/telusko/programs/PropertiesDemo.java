package com.telusko.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fls = new FileInputStream("C:\\Users\\91970\\eclipse-workspace2\\javaprograms\\teluskoprograms\\com\\telusko\\programs\\demo.properties");
		Properties p=new Properties();
		p.load(fls);
		String name=p.getProperty("name");
		String roll=p.getProperty("rollno");
		
		System.out.println("This name is: "+name);
		System.out.println("The roll no is: "+roll);
		
	}

}
