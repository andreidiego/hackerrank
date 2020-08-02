package io.andreidiego.algorithms.hackerrank.problemsolving.a_warmup.i_birthdaycakecandles;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		int numberOfCandles = 0;
		int biggestHeight = 0;

		for (int i = 0; i < ar.length; i++) {
			int candleHeight = ar[i];

			if (candleHeight > biggestHeight) {
				biggestHeight = candleHeight;
				numberOfCandles = 1;

			} else if (candleHeight == biggestHeight) {
				numberOfCandles++;
			}
		}

		return numberOfCandles;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = birthdayCakeCandles(ar);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		System.out.println(result);

		scanner.close();
	}
}
