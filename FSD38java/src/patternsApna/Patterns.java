package patternsApna;

public class Patterns{
	
	public static void main(String[] args) {
		int m=4;
		int n=5;
		//solid Rectangle
		//outer loop
		for(int i=1;i<=m;i++) {
			//inner loop
			for(int j=1;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	
}