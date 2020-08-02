package io.andreidiego.algorithms.hackerrank.thirtydaysofcode.b_day1.datatypes;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int j;
		double k;
		String w;

		/* Read and save an integer, double, and String to your variables. */
		j = scan.nextInt();
		k = scan.nextDouble();
		w = scan.next();
		w = w + scan.nextLine();

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + j);

		/* Print the sum of the double variables on a new line. */
		System.out.println(d + k);

		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s + w);
		scan.close();
	}
}