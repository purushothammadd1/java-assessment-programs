package nestedloop;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toptoBottom(5);

	}

	public static void toptoBottom(int n) {
		// TODO Auto-generated method stub
		//toptobottompattern
		for (int i=5;i>=1;--i) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
