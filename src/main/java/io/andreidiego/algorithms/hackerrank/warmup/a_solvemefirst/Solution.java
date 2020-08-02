package io.andreidiego.algorithms.hackerrank.warmup.a_solvemefirst;

import java.util.Scanner;

public class Solution {

	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		return a + b;
	}

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		System.out.println(solveMeFirst(in.nextInt(), in.nextInt()));

		in.close();
	}
}
