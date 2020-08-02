package io.andreidiego.algorithms.hackerrank.thirtydaysofcode.h_day7.arrays;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		
		int[] array = new int[arraySize];
		
		for (int i = arraySize - 1; i >= 0; i--) {
			array[i] = scan.nextInt();
		}
		
		scan.close();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
