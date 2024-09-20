package conditionalstatements;

public class AlphabetAscii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asciiLetter(7);
	}
	public static void asciiLetter(int n) {
		for(int i=0;i<127;i++) {
			System.out.printf("%d:%ch \n",i,i);
		}
	}
}
