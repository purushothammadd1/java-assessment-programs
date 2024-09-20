package decoderencoder;

import java.util.ArrayList;
import java.util.List;

public class T9 {
	private static final String [] OPTIONS = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> getAllT9Decodings(String t9){
		ArrayList<String> output=new ArrayList<>();
		if(t9.equals("")) {
			output.add("");
			return output;
		}
		int firstNum=Integer.valueOf(t9.substring(0,1));
		for(char c: OPTIONS [firstNum].toCharArray()) {
			for(String s: getAllT9Decodings(t9.substring(1)))
				output.add(c +s);
		}
		return output;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(getAllT9Decodings("57"));
	}

	
}
