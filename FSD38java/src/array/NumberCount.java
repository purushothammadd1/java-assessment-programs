package array;

import java.util.Scanner;

public class NumberCount {
	public static String countNumber(int t,int arr[]) {
		// TODO Auto-generated method stub
		int count =0, sum=0;
		String res=" ";
		for(int i=0;i<arr.length;i++) {
			if(t==arr[i]) {
				count++;
			}
			sum +=arr[i];
		}
		res=count+" and "+sum;
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many size do u required?");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Target Element:");
		int t=sc.nextInt();
		
		System.out.println("It repeats and its sum is: "+countNumber(t,arr));
		
	}

	

}
