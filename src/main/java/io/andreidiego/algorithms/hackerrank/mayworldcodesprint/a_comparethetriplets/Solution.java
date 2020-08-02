package io.andreidiego.algorithms.hackerrank.mayworldcodesprint.a_comparethetriplets;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		in.close();
		
		int alicesPoints = 0;
		int bobsPoints = 0;

		if (a0 > b0)
			alicesPoints++;
		else if (a0 < b0)
			bobsPoints++;

		if (a1 > b1)
			alicesPoints++;
		else if (a1 < b1)
			bobsPoints++;

		if (a2 > b2)
			alicesPoints++;
		else if (a2 < b2)
			bobsPoints++;

		System.out.println(alicesPoints + " " + bobsPoints);
	}
}