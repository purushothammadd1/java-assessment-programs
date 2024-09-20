package RefresherSession;

import java.util.ArrayList;
import java.util.List;

public class LambaDemo {
	
	public boolean isEven(int x) {
		return x % 2 ==0;
	}
	
//	public boolean isPerfectSquare(int x) {
//	
//		return 
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=1;i<=100;i++) {
			nums.add(i);
		}
		LambaDemo ld =new LambaDemo();
		for(int i=0;i<100;i++) {
			int num=nums.get(i);
			if(ld.isEven(num))
				System.out.println(num);
		}
	}

}
