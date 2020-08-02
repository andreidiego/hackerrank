package io.andreidiego.algorithms.hackerrank.warmup.c_averybigsum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int numberOfValues = scan.nextInt();
		long result = 0;
		
		for (int i = 0; i < numberOfValues; i++) {
			result += scan.nextInt();
		}
		
		System.out.println(result);
		scan.close();
	}
}