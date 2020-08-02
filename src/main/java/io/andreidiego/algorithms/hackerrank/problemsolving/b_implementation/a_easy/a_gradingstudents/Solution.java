package io.andreidiego.algorithms.hackerrank.problemsolving.b_implementation.a_easy.a_gradingstudents;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		int[] roundedGrades = new int[grades.length];

		for (int i = 0; i < grades.length; i++) {
			int grade = grades[i];

			if (grade >= 38) {
				int howFarFromNextMultipleOf5 = grade % 5;

				if (howFarFromNextMultipleOf5 >= 3) {
					grade += (5 - howFarFromNextMultipleOf5);
				}
			}

			roundedGrades[i] = grade;
		}

		return roundedGrades;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			// bw.write(String.valueOf(result[resultItr]));
			System.out.println(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				// bw.write("\n");
			}
		}

		// bw.newLine();

		// bw.close();
	}
}
