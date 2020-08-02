package io.andreidiego.algorithms.hackerrank.mayworldcodesprint.d_beautifulquadruples;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		scan.close();

		int numberOfBeautifulQuadruples = 0;

		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < b; j++) {
				
				for (int k = 0; k < c; k++) {
					
					for (int n = 0; n < a; n++) {

					}
				}
			}

			if ((a ^ b ^ c ^ d) != 0)
				numberOfBeautifulQuadruples++;
		}

		System.out.println(1 ^ 2 ^ 3 ^ 4);
	}
}