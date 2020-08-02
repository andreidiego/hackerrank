package io.andreidiego.algorithms.hackerrank.problemsolving.b_implementation.a_easy.b_appleandorange;

import java.util.Scanner;

public class Solution {

	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int houseStartPoint, int houseEndPoint, int appleTreeLocation,
			int orangeTreeLocation, int[] applesDistanceFromTheTree, int[] orangesDistanceFromTheTree) {
		int applesInTheHouse = 0;
		int orangesInTheHouse = 0;

		for (int i = 0; i < applesDistanceFromTheTree.length; i++) {
			int appleDistanceFromTheTree = applesDistanceFromTheTree[i];
			int appleAbsolutePosition = appleDistanceFromTheTree + appleTreeLocation;

			if (appleAbsolutePosition >= houseStartPoint && appleAbsolutePosition <= houseEndPoint) {
				applesInTheHouse++;
			}
		}

		for (int i = 0; i < orangesDistanceFromTheTree.length; i++) {
			int orangeDistanceFromTheTree = orangesDistanceFromTheTree[i];
			int orangeAbsolutePosition = orangeDistanceFromTheTree + orangeTreeLocation;

			if (orangeAbsolutePosition >= houseStartPoint && orangeAbsolutePosition <= houseEndPoint) {
				orangesInTheHouse++;
			}
		}

		System.out.println(applesInTheHouse);
		System.out.println(orangesInTheHouse);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] st = scanner.nextLine().split(" ");
		int s = Integer.parseInt(st[0]);
		int t = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");
		int m = Integer.parseInt(mn[0]);
		int n = Integer.parseInt(mn[1]);

		int[] apples = new int[m];

		String[] applesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			int applesItem = Integer.parseInt(applesItems[i]);
			apples[i] = applesItem;
		}

		int[] oranges = new int[n];

		String[] orangesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int orangesItem = Integer.parseInt(orangesItems[i]);
			oranges[i] = orangesItem;
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);

		scanner.close();
	}
}