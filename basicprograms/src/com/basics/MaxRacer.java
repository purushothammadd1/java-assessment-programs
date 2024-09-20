package com.basics;

public class MaxRacer {
    public static void main(String[] args) {
        int input1 = 5;
        int input2[][] = { {1, 7}, {2, 4}, {6, 9}, {3, 8}, {5, 10}};
        int maxracer = maxRacer(input1, input2);
        System.out.println("Max Value: " + maxracer);
    }

    public static int maxRacer(int input1, int[][] input2) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input1; i++) {
            if (min > input2[i][0]) {
                min = input2[i][0];
            }
            if (max < input2[i][1]) {
                max = input2[i][1];
            }
        }
        int ans = 0;
        for (int i = min; i <= max; i++) {
            int check = 0;
            for (int j = 0; j < input1; j++) {
                if (input2[j][0] < i && input2[j][1] >= i) {
                    check++;
                }
            }
            if (check > ans) {
                ans = check;
            }
        }
        return ans;
    }
}
