package io.andreidiego.algorithms.hackerrank.implementation.b_sherlockandthebeast;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author u3v3
 * 
 *         This solution is flawed. It was left here just as history in case I
 *         face a similar problem and want to refresh my memory on the code I
 *         used.
 */
public class WrongGenericSolution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named WrongGenericSolution.
		 */
		Scanner scan = new Scanner(System.in);

		int numberOfTestCases = scan.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfDigits = scan.nextInt();

			if (numberOfDigits < 3) {
				System.out.println("-1");

			} else if (numberOfDigits % 3 == 0) {
				char[] arrayOf5s = new char[numberOfDigits];
				Arrays.fill(arrayOf5s, '5');
				System.out.println(arrayOf5s);

			} else if (numberOfDigits % 3 == 2) {
				char[] arrayOf5s = new char[((numberOfDigits / 3) - 1) * 3];
				Arrays.fill(arrayOf5s, '5');

				char[] arrayOf3s = new char[5];
				Arrays.fill(arrayOf3s, '3');

				System.out.print(arrayOf5s);
				System.out.println(arrayOf3s);

			} else if (numberOfDigits % 5 == 0) {
				char[] arrayOf3s = new char[numberOfDigits];
				Arrays.fill(arrayOf3s, '3');

				System.out.println(arrayOf3s);

			} else if (numberOfDigits % 5 == 3) {
				/*
				 * The use of this "more generic" calculation instead of just
				 * numberOfDigits - 3 is only to make the general mathematical
				 * rule behind the allocation clear
				 */
				char[] arrayOf3s = new char[(numberOfDigits / 5) * 5];
				Arrays.fill(arrayOf3s, '3');

				char[] arrayOf5s = new char[3];
				Arrays.fill(arrayOf5s, '5');

				System.out.print(arrayOf3s);
				System.out.println(arrayOf5s);

			} else {
				System.out.println("-1");
			}

			// assertThat(result.length(), is(numberOfDigits));
		}

		scan.close();
	}
}