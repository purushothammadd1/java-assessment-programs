package patterns;

import java.util.Scanner;

public class ReverseNumberPattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the n value: ");
	int n=sc.nextInt();
	
	int i=1;
	while(i<=n) {
		int j=i;
		while(j>=1) {
//			int p=n-j+1;
			System.out.print(j);
//			p++;
			j--;
		}
		System.out.println();
		i++;
	}
}
}
