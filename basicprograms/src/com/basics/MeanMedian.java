package com.basics;
import java.util.Arrays;
public class MeanMedian {
    public static void main(String [] args) {
    	int input1=5;
    	int[] input2= {1,2,2,3,3};
    	 int[] subset = meanMedian(input1, input2);
         System.out.println("Subset with Maximum Difference: " + Arrays.toString(subset));
    }
	public static int[] meanMedian(int input1, int[] input2) {
		Arrays.sort(input2);
		int n=input2.length;
//		int maxDiff=0;
		int maxDiff=Integer.MIN_VALUE;
		int[] maxSubset= new int[0];
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int[] subset=Arrays.copyOfRange(input2, i, j+1);
				double mean=Arrays.stream(subset).average().getAsDouble();
				int median=subset[subset.length/2];
				
				int diff=(int)(mean-median);
				if(diff>maxDiff) {
					maxDiff =diff;
					maxSubset=subset;
				}
			}
		}
		return maxSubset;
	}
}
/*int median;
if(subset.length % 2 ==0) {
	median =(subset[subset.length/ 2-1] + subset[subset.length / 2])/2;
}else {
	median=subset[subset.length/2];
}*/