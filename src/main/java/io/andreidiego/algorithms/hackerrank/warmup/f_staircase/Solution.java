package io.andreidiego.algorithms.hackerrank.warmup.f_staircase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int staircaseHeight = scan.nextInt();
		scan.close();

		for (int i = 1; i <= staircaseHeight; i++) {

			for (int j = 1; j <= staircaseHeight; j++) {
				if (j <= (staircaseHeight - i))
					System.out.print(" ");
				else
					System.out.print("#");
			}

			System.out.println("");
		}
	}
}