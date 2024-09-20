package Sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add("Vowels");
		list.add("Harsha");
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add(2.3f);
		list.add(4.5);
		
		System.out.println(list);
		System.out.println();
				
		ListIterator iterator = list.listIterator();		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			
//			if (iterator.next().equals("Harsha")) {
//				System.out.println("Harsha is available");
//			}
		}
		System.out.println("\n");
		
		
		
		ListIterator iterator2 = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous() + " ");
			
//			if (iterator.previous().equals("Vowels")) {
//				System.out.println("Vowels are available");
//			}
		}
		
	}
}
/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int Quotient;
		
		Scanner scan = new Scanner(System.in);
		
		
		try {		
			System.out.println("Enter Two Numbers");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.println();
			
			Quotient = num1 / num2;		
			System.out.println("Quotient: " + Quotient);
			
		} catch (ArithmeticException ex) {
			System.out.println("Exception Occured: Cannot Divide By Zero(0).");
			System.out.println(ex);		
			
		} catch (InputMismatchException ex) {
			System.out.println("Exception Occured: Provide the Numeric value without decimal within the range of -2147483648 to +2147483647.");
			System.out.println(ex);
			
		} catch (Exception ex) {			
			System.out.println(ex);			
		}
		System.out.println();
		
		System.out.println("My Name is Harsha");		
	}
}





 * try
 * 1. is a block, used to identify the runtime errors and pass them to the catch block
 * 2. identify the code which might generate the run time error, then enclose that code within the try block
 * 3. identify the code which is dependent on the code that is generating the run time error, and enclose that code within the try block
 * 
 * catch
 * 1. is a block, used to handle the runtime errors
 * 
 * */
