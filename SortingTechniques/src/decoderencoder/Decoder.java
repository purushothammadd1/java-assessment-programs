package decoderencoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decoder {
	private static final String [] T9_KEYS= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static List<String> getAllT9Decodings(String t9){
		List<String> res=new ArrayList<>();
		if(t9 == null|| t9.length() ==0) {
			return res;
		}
		backtrack(res,"",t9,0);
		return res;
	}

	private static void backtrack(List<String> res, String current, String t9, int ind) {
		if(ind == t9.length()) {
			res.add(current);
			return;
		}
		int digit =t9.charAt(ind) - '0';
		String letters=T9_KEYS[digit];
		for(int i=0;i<letters.length();i++) {
			char c=letters.charAt(i);
			backtrack(res, current + c , t9, ind +1);
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String t9=sc.next();
		
		List<String> decode =getAllT9Decodings(t9);
		System.out.println(decode);
	}
	

}
