package io.andreidiego.algorithms.hackerrank.problemsolving.a_warmup.e_diagonaldifference;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int rightDiagonalSum = 0;
		int leftDiagonalSum = 0;

		for (int n = 0, i = 0, j = arr.length - 1; n < arr.length; n++, i++, j--) {
			rightDiagonalSum += arr[n][i];
			leftDiagonalSum += arr[n][j];
		}

		return Math.abs(rightDiagonalSum - leftDiagonalSum);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		System.out.println(result);

		scanner.close();
	}
}