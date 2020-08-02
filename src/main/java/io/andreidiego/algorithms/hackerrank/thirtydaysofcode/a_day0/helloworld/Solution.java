package io.andreidiego.algorithms.hackerrank.thirtydaysofcode.a_day0.helloworld;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		// use the Scanner class to read from stdin
		Scanner scan = new Scanner(System.in);

		// read a line of input and save it to a variable
		String inputString = scan.nextLine();

		// close the scanner
		scan.close();

		// Your first line of output goes here
		System.out.println("Hello, World.");

		// Write the second line of output
		System.out.println(inputString);
	}
}
