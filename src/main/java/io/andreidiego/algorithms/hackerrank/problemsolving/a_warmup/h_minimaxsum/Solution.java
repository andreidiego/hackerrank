package io.andreidiego.algorithms.hackerrank.problemsolving.a_warmup.h_minimaxsum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long minimumSum = 0;
		long maximumSum = 0;

		int[] sortedArray = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArray);

		for (int i = 0, j = sortedArray.length - 1; i < 4; i++, j--) {
			minimumSum += sortedArray[i];
			maximumSum += sortedArray[j];
		}

		System.out.println(minimumSum + " " + maximumSum);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}