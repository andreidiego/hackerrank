package io.andreidiego.algorithms.hackerrank.implementation.b_sherlockandthebeast;

import java.util.Arrays;
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
		
		for(int i = 0; i < numberOfTestCases; i++) {
			int numberOfDigits = scan.nextInt();
			int n = numberOfDigits;
			
			while(n > 0 && n % 3 != 0) {
				n-=5;
			}
			
			if(n < 0) {
				System.out.println("-1");
				
			} else { 
				char[] arrayOf5s = new char[n];
				char[] arrayOf3s = new char[numberOfDigits - n];
				
				Arrays.fill(arrayOf5s, '5');
				Arrays.fill(arrayOf3s, '3');
				
				System.out.print(arrayOf5s);
				System.out.println(arrayOf3s);
			}
		}
		
		scan.close();
	}
}