package io.andreidiego.algorithms.hackerrank.mayworldcodesprint.c_absolutepermutation;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. 
		 * Read input from STDIN. 
		 * Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);

		int numberOfTestCases = scan.nextInt();

		for (int testCase = 0; testCase < numberOfTestCases; testCase++) {
			int n = scan.nextInt();
			int k = scan.nextInt();

			int permutations[] = new int[n];

			// Generates the lexicographically smallest permutation
			for (int position = permutations.length - 1, value = n; position >= 0 && value >= 1; position--, value--) {
				permutations[position] = value;
			}

			// Uses k to generate the lexicographically smallest absolute
			// permutation

			boolean notAnAbsolutePermutation = false;

			for (int position = 0; position < permutations.length; position++) {

				int positionMinusValue = Math.abs(position + 1 - permutations[position]);

				if (positionMinusValue != k) {

					if (position + k > permutations.length - 1) {
						notAnAbsolutePermutation = true;
						break;
					}

					int temp = permutations[position + k];
					permutations[position + k] = permutations[position];
					permutations[position] = temp;
				}
			}

			if (notAnAbsolutePermutation)
				System.out.println("-1");
			else
				System.out.println(printPermutations(permutations));
		}

		scan.close();
	}

	private static String printPermutations(int[] permutations) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < permutations.length; i++) {
			result.append(permutations[i] + " ");
		}

		return result.toString();
	}
}