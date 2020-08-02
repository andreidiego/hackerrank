package io.andreidiego.algorithms.hackerrank.thirtydaysofcode.g_day6.letsreview;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);

		int numberOfTestCases = scan.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			
			char[] string = scan.next().toCharArray();

			for (int k = 0; k < string.length; k++) {
				
				if (k % 2 == 0)
					System.out.print(string[k]);

			}
			
			System.out.print(" ");
			
			for (int j = 0; j < string.length; j++) {
				
				if (j % 2 == 1)
					System.out.print(string[j]);

			}
			
			System.out.println("");
		}

		scan.close();
	}
}