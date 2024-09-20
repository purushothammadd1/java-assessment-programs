package Intro.java;

public class Test {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("Date1 "+d1.toString());
		
		 // Create a new Date object with a specific date
        Date date2 = new Date(15, 4, 2023);
        System.out.println("Date 2: " + date2.toString());
        
        // Get the next day of the second date
        Date date3 = date2.nextDay();
        System.out.println("Next day of Date 2: " + date3.toString());

	}

}
