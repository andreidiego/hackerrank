package io.andreidiego.algorithms.hackerrank.interviewpreparationkit.a_arrays.b_arraysleftrotation;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int[] rotatedArray = new int[a.length];

		for (int i = 0; i < a.length - d; i++) {
			rotatedArray[i] = a[i + d];
		}

		for (int i = a.length - d, j = 0; i < rotatedArray.length; i++, j++) {
			rotatedArray[i] = a[j];
		}

		return rotatedArray;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
			// bufferedWriter.write(String.valueOf(result[i]));
			//
			// if (i != result.length - 1) {
			// bufferedWriter.write(" ");
			// }
		}
		//
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		scanner.close();
	}
}