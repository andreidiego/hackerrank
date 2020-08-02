package io.andreidiego.algorithms.hackerrank.implementation.b_sherlockandthebeast;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author u3v3
 * 
 *         This test class never worked. It has been left here to for history
 *         purpose in case I face similar Stream manipulation issues again.
 *
 */
public class WrongGenericSolutionStressTest_old {

	public static void main(String[] args) {
		InputStream systemIn = System.in;
		PrintStream systemOut = System.out;

		InputStream solutionInputStream = new ByteArrayInputStream(String.valueOf(1000000).getBytes());
		ByteArrayOutputStream solutionOut = new ByteArrayOutputStream();
		PrintStream solutionPrintStream = new PrintStream(solutionOut);

		InputStream wrongGenericSolutionInputStream = new ByteArrayInputStream(String.valueOf(1000000).getBytes());
		ByteArrayOutputStream wrongGenericSolutionOut = new ByteArrayOutputStream();
		PrintStream wrongGenericSolutionPrintStream = new PrintStream(wrongGenericSolutionOut);

		try {
			String wrongGenericSolution = "";
			String solution = "";
			int numberOfDigits = 0;

			while (solution.equals(wrongGenericSolution)) {
				System.setIn(solutionInputStream);
				System.setOut(solutionPrintStream);

				solutionInputStream.read(String.valueOf(numberOfDigits).getBytes());
				Solution.main(args);
				// solutionPrintStream.flush();
				solution = solutionOut.toString();

				System.setOut(systemOut);
				System.out.println("solution: " + solution);
				System.setOut(solutionPrintStream);

				System.setIn(wrongGenericSolutionInputStream);
				System.setOut(wrongGenericSolutionPrintStream);

				wrongGenericSolutionInputStream.read(String.valueOf(numberOfDigits).getBytes());
				WrongGenericSolution.main(args);
				wrongGenericSolution = wrongGenericSolutionOut.toString();

				System.setOut(systemOut);
				System.out.println("wrongGenericSolution: " + wrongGenericSolution);
				System.setOut(solutionPrintStream);

				numberOfDigits++;
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			System.setIn(systemIn);
			System.setOut(systemOut);
		}

	}
}