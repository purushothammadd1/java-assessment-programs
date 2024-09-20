package com.basic.programs;

import java.util.HashSet;
import java.util.Set;

public class ValidMatrix {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 1, 1},
				{2, 3, 1},
				{3, 2, 1}
		};
		System.out.println(isValid(matrix));
	}

	public static boolean isValid(int[][] matrix) {
		int n = matrix.length;
		Set<Integer> rowSet, colSet;

		for (int i = 0; i < n; i++) {
			rowSet = new HashSet<>();
			colSet = new HashSet<>();
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] < 1 || matrix[i][j] > n || rowSet.contains(matrix[i][j]))
					return false;
				rowSet.add(matrix[i][j]);

				if (matrix[j][i] < 1 || matrix[j][i] > n || colSet.contains(matrix[j][i]))
					return false;
				colSet.add(matrix[j][i]);
			}
			if (rowSet.size() != n || colSet.size() != n)
				return false;
		}

		return true;
	}
}
