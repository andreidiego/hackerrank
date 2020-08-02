package io.andreidiego.algorithms.hackerrank.warmup.b_simplearraysum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int result = 0;
		
		for(int j = 0; j < i; j++) {
			result += scan.nextInt();
		}
		
		scan.close();

		System.out.println(result);
	}
}