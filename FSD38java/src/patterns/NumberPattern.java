package patterns;

public class NumberPattern {

	//private static String ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberPattern(6);

	}

	public static void numberPattern(int n) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				temp++;
				
				System.out.print(" "+temp);
			}
			System.out.println();
		}
	}

}
