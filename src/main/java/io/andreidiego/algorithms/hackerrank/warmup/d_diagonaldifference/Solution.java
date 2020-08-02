package io.andreidiego.algorithms.hackerrank.warmup.d_diagonaldifference;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);
		int matrixDimension = scan.nextInt();
		int rightDiagonal = 0;
		int leftDiagonal = 0;

		for (int i = 0; i < matrixDimension; i++) {

			for (int j = 0; j < matrixDimension; j++) {
				int interestingValue = scan.nextInt();

				if (j == i)
					rightDiagonal += interestingValue;

				if (j == (matrixDimension - i - 1))
					leftDiagonal += interestingValue;
			}

		}

		scan.close();
		System.out.println(Math.abs(rightDiagonal - leftDiagonal));
	}
}