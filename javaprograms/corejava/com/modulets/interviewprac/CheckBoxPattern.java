package com.modulets.interviewprac;

import java.util.Scanner;

public class CheckBoxPattern {
    public static void getStarPattern(int n) {
        // Write your code here
        char[][] pattern = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || i == n-1 || j == 0 ||j == n-1){
                    pattern[i][j]= '*';
                }else{
                    pattern[i][j]=' ';
                }
            }
        }
//        pattern[n-1][n-1] =' ';
        for(int j=0;j<n;j++) {
        	pattern[n-1][j]='*';
        }
        for(int i=1;i<n-1;i++) {
        	pattern[i][n-1]='*';
        }
        for(int i=0;i<n;i++){
            System.out.println(new String(pattern[i]));
        }
    }
	public static void main(String[] args) {
		getStarPattern(8);
	}

}
