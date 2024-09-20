package collectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 =new Employee(1, 23,"purushotham", new Address("Jangaon",506167));
		Employee e2 =new Employee(2, 27,"rajesh", new Address("bhemmavaram",600167));
		Employee e3 =new Employee(3, 22,"Harish", new Address("suryapet",506032));
		Employee e4 =new Employee(4, 26,"Sai kiran", new Address("Hyderabad",500067));
		
		List<Employee> empList =new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		System.out.println("The unsorted List:"+empList);
		
		Collections.sort(empList, new AgeComparator());
		System.out.println("sorted on Age:"+empList);
		
		Collections.sort(empList, new NameCompartor());
		System.out.println("sorted on Name:"+empList);
		
		Collections.sort(empList, new AddressComparator());
		System.out.println("Sorted on Address:"+empList);
		
	}

}
