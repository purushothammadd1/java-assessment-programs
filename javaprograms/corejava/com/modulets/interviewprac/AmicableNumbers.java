package com.modulets.interviewprac;

public class AmicableNumbers {
	public int getSumOfProperDivisors(int n) {
		int divisorsSum =1;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n % i ==0) {
				divisorsSum += i;
				if(i != n/i) {
					divisorsSum += n/i;
				}
			}
		}
		return divisorsSum;
	}
	
	public int sumOfAmicablePairs(int start, int end) {
		int amicableSum=0;
		for(int num=start; num <= end; num++) {
			int divisorSum = getSumOfProperDivisors(num);
			if(num < divisorSum && getSumOfProperDivisors(divisorSum) == num) {
				amicableSum += (num + divisorSum);
			}
		}
		return amicableSum;
	}
	public static void main(String[] args) {
		System.out.println(new AmicableNumbers().sumOfAmicablePairs(1, 1000000));
		System.out.println(new AmicableNumbers().getSumOfProperDivisors(220));
	}

}
