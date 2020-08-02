package io.andreidiego.algorithms.hackerrank.problemsolving.b_implementation.a_easy.d_betweentwosets;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the getTotalX function below.
	 */
	static int getTotalX(int[] a, int[] b) {
		int totalX = 0;

		for (int i = 1; i <= 100; i++) {
			boolean firstRequirementFailed = false;
			boolean secondRequirementFailed = false;

			for (int j = 0; j < a.length; j++) {
				if (i % a[j] != 0) {
					firstRequirementFailed = true;
					break;
				}
			}

			if (firstRequirementFailed) {
				continue;
			}

			for (int j = 0; j < b.length; j++) {
				if (b[j] % i != 0) {
					secondRequirementFailed = true;
					break;
				}
			}

			if (secondRequirementFailed) {
				continue;
			}

			totalX++;
		}

		return totalX;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scan.nextLine().split(" ");
		int n = Integer.parseInt(nm[0].trim());
		int m = Integer.parseInt(nm[1].trim());

		int[] a = new int[n];

		String[] aItems = scan.nextLine().split(" ");

		for (int aItr = 0; aItr < n; aItr++) {
			int aItem = Integer.parseInt(aItems[aItr].trim());
			a[aItr] = aItem;
		}

		int[] b = new int[m];

		String[] bItems = scan.nextLine().split(" ");

		for (int bItr = 0; bItr < m; bItr++) {
			int bItem = Integer.parseInt(bItems[bItr].trim());
			b[bItr] = bItem;
		}

		int total = getTotalX(a, b);

		// bw.write(String.valueOf(total));
		// bw.newLine();
		//
		// bw.close();

		System.out.println(total);
	}
}
