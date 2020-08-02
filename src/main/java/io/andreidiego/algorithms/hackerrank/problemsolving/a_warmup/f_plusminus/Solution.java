package io.andreidiego.algorithms.hackerrank.problemsolving.a_warmup.f_plusminus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		float positives = 0;
		float negatives = 0;
		float zeroes = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				positives++;

			} else if (arr[i] < 0) {
				negatives++;

			} else {
				zeroes++;
			}
		}

		DecimalFormat df = new DecimalFormat("0.000000");

		System.out.println(df.format(positives / arr.length));
		System.out.println(df.format(negatives / arr.length));
		System.out.println(df.format(zeroes / arr.length));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}