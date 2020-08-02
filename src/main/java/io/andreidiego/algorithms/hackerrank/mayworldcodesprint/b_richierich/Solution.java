package io.andreidiego.algorithms.hackerrank.mayworldcodesprint.b_richierich;

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

		int numberOfDigits = scan.nextInt();
		int allowedChanges = scan.nextInt();
		char[] numberToMakePalindromic = scan.next().toCharArray();

		scan.close();

		solution(numberOfDigits, allowedChanges, numberToMakePalindromic);
	}

	private static int howManyChangesAreNeeded(char[] numberToMakePalindromic) {

		int changesNeeded = 0;

		for (int i = 0, j = numberToMakePalindromic.length - 1; i <= j; i++, j--) {
			if (numberToMakePalindromic[i] != numberToMakePalindromic[j])
				changesNeeded++;
		}

		return changesNeeded;
	}

	private static void solution(int numberOfDigits, int allowedChanges, char[] numberToMakePalindromic) {
		int normalChanges = howManyChangesAreNeeded(numberToMakePalindromic);

		if (allowedChanges < normalChanges) {
			System.out.println("-1");
			return;
		}

		int spareChanges = allowedChanges - normalChanges;

		for (int i = 0, j = numberToMakePalindromic.length - 1; spareChanges + normalChanges > 0 && i <= j; i++, j--) {

			if (numberToMakePalindromic[i] != numberToMakePalindromic[j]) {
				normalChanges--;

				if (spareChanges > 0) {

					if (numberToMakePalindromic[i] != '9' && numberToMakePalindromic[j] != '9') {
						numberToMakePalindromic[i] = '9';
						numberToMakePalindromic[j] = '9';
						spareChanges--;
					}
				}

				if (numberToMakePalindromic[i] > numberToMakePalindromic[j]) {
					numberToMakePalindromic[j] = numberToMakePalindromic[i];
				}

				if (numberToMakePalindromic[i] < numberToMakePalindromic[j]) {
					numberToMakePalindromic[i] = numberToMakePalindromic[j];
				}

			} else if (spareChanges > 1 && numberToMakePalindromic[i] != '9') {
				numberToMakePalindromic[i] = '9';
				numberToMakePalindromic[j] = '9';
				spareChanges -= 2;
			}
		}

		if (spareChanges > 0 && numberOfDigits % 2 != 0)
			numberToMakePalindromic[(int) Math.floor(numberOfDigits / 2d)] = '9';

		System.out.println(numberToMakePalindromic);
	}
}