package io.andreidiego.algorithms.hackerrank.implementation.b_sherlockandthebeast;

import java.util.Arrays;

/**
 * @author u3v3
 * 
 *         This stress test proved that the original 'generic' solution was
 *         flawed.
 *
 */
public class WrongGenericSolutionStressTest {

	public static void main(String[] args) {

		String correctSolution = "";
		String wrongSolution = "";
		int numberOfDigits = 0;

		while (correctSolution.equals(wrongSolution)) {

			System.out.println("numberOfDigits: " + numberOfDigits);

			correctSolution = correctSolution(numberOfDigits);
			wrongSolution = wrongSolution(numberOfDigits);

			numberOfDigits++;
		}

		System.out.println("correctSolution: " + correctSolution);
		System.out.println("wrongSolution: " + wrongSolution);
	}

	private static String wrongSolution(int numberOfDigits) {

		if (numberOfDigits < 3) {
			return "-1";

		} else if (numberOfDigits % 3 == 0) {
			char[] arrayOf5s = new char[numberOfDigits];
			Arrays.fill(arrayOf5s, '5');

			return String.valueOf(arrayOf5s);

			// } else if ((numberOfDigits / 3) > 1 && numberOfDigits % 3 == 1) {
			// char[] arrayOf5s = new char[((numberOfDigits / 3) - 3) * 3];
			// Arrays.fill(arrayOf5s, '5');
			//
			// char[] arrayOf3s = new char[10];
			// Arrays.fill(arrayOf3s, '3');
			//
			// return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);
			//
		} else if (numberOfDigits % 3 == 2) {
			char[] arrayOf5s = new char[((numberOfDigits / 3) - 1) * 3];
			Arrays.fill(arrayOf5s, '5');

			char[] arrayOf3s = new char[5];
			Arrays.fill(arrayOf3s, '3');

			return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);

		} else if (numberOfDigits % 5 == 0) {
			char[] arrayOf3s = new char[numberOfDigits];
			Arrays.fill(arrayOf3s, '3');

			return String.valueOf(arrayOf3s);

		} else if (numberOfDigits % 5 == 1) {
			char[] arrayOf3s = new char[((numberOfDigits / 5) - 1) * 5];
			Arrays.fill(arrayOf3s, '3');

			char[] arrayOf5s = new char[6];
			Arrays.fill(arrayOf5s, '5');

			return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);

		} else if ((numberOfDigits / 5) > 1 && (numberOfDigits % 5 != numberOfDigits) && numberOfDigits % 5 == 2) {
			char[] arrayOf3s = new char[((numberOfDigits / 5) - 2) * 5];
			Arrays.fill(arrayOf3s, '3');

			char[] arrayOf5s = new char[12];
			Arrays.fill(arrayOf5s, '5');

			return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);

		} else if (numberOfDigits % 5 == 3) {
			/*
			 * The use of this "more generic" calculation instead of just
			 * numberOfDigits - 3 is only to make the general mathematical rule
			 * behind the allocation clear
			 */
			char[] arrayOf3s = new char[(numberOfDigits / 5) * 5];
			Arrays.fill(arrayOf3s, '3');

			char[] arrayOf5s = new char[3];
			Arrays.fill(arrayOf5s, '5');

			return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);

		} else if ((numberOfDigits % 5 != numberOfDigits) && numberOfDigits % 5 == 4) {
			char[] arrayOf3s = new char[((numberOfDigits / 5) - 1) * 5];
			Arrays.fill(arrayOf3s, '3');

			char[] arrayOf5s = new char[9];
			Arrays.fill(arrayOf5s, '5');

			return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);

		} else {
			return "-1";
		}
	}

	private static String correctSolution(int numberOfDigits) {

		if (numberOfDigits == 0) {
			return "-1";

		} else {

			int n = numberOfDigits;

			while (n > 0 && n % 3 != 0) {
				n -= 5;
			}

			if (n < 0) {
				return "-1";

			} else {
				char[] arrayOf5s = new char[n];
				char[] arrayOf3s = new char[numberOfDigits - n];

				Arrays.fill(arrayOf5s, '5');
				Arrays.fill(arrayOf3s, '3');

				return String.valueOf(arrayOf5s) + String.valueOf(arrayOf3s);
			}
		}
	}

}
