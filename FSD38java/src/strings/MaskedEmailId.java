package strings;

import java.util.Scanner;

public class MaskedEmailId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email id:");
		String email=sc.nextLine();
		System.out.println(maskId(email));

	}

	public static String maskId(String email) {
		int index=email.indexOf('@');
		String end_id=email.substring(index);
		String mask="";
		int n=email.substring(2,index).length();
		for(int i=0;i<n;i++) {
			mask+="x";
		}
		mask=email.substring(0,2)+mask+end_id;
		return mask;
		
	}

}
