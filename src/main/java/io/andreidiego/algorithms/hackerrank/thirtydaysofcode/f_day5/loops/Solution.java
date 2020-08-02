package io.andreidiego.algorithms.hackerrank.thirtydaysofcode.f_day5.loops;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int inputInteger = scan.nextInt();
		scan.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(inputInteger + " x " + i + " = " + inputInteger * i);
		}

	}
}