package com.interview.pract;

import java.util.Scanner;

public class SkyDiving {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		System.out.println(minAttempts(n,k));
	}

	public static int minAttempts(int n, int k) {
		if(n == 0) {
			return 0;
		}
		if(k == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		if(k == 1) {
			return n;
		}
		int[][] dp=new int[k+1][n+1];
		for(int i=1;i<=k;i++) {
			dp[i][0] = 0;
			dp[i][1] = 1;
		}

		for(int j=1;j<=n;j++) {
			dp[1][j] =j;
		}
		for(int i=2;i<=k;i++) {
			for(int j=2;j<=n;j++) {
				dp[i][j]=Integer.MAX_VALUE;
				for(int x=1;x<=j;x++) {
					int res=1+Math.max(dp[i-1][x-1], dp[i][j-x]);
					if(res < dp[i][j]) {
						dp[i][j] = res;
					}
				}
			}
		}
		return dp[k][n];
	}

}
