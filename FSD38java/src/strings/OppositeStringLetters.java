package strings;

public class OppositeStringLetters {
	public static void convertString(StringBuffer str) {
		int size=str.length();
		for(int i=0;i<size;i++) {
			Character c=str.charAt(i);
			if(Character.isLowerCase(c))
				str.replace(i, i+1,Character.toUpperCase(c)+"");
			else
				str.replace(i, i+1, Character.toLowerCase(c)+"");
		}
	}

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("This Is a SAMPLE text!");
		convertString(str);
		System.out.println(str);

	}

}
