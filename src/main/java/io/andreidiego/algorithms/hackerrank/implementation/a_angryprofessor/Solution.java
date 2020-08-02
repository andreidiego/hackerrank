package io.andreidiego.algorithms.hackerrank.implementation.a_angryprofessor;

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
		
		for (int i = 0; i < numberOfTestCases; i++) {
			int totalNumberOfStudents = scan.nextInt();
			int numberOfStudentsRequired = scan.nextInt();
			
			int numberOfStudentsPresent = 0;

			for (int j = 0; j < totalNumberOfStudents; j++) {
				int arrivalTime = scan.nextInt();

				if (arrivalTime <= 0) {
					numberOfStudentsPresent++;
				}
			}

			System.out.println(numberOfStudentsPresent < numberOfStudentsRequired ? "YES" : "NO");
		}

		scan.close();
	}
}