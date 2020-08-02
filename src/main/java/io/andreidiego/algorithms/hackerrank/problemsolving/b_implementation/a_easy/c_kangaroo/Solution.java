package io.andreidiego.algorithms.hackerrank.problemsolving.b_implementation.a_easy.c_kangaroo;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the kangaroo function below.
	static String kangaroo(int kangaroo1StartingPosition, int kangaroo1JumpingDistance, int kangaroo2StartingPosition,
			int kangaroo2JumpingDistance) {

//		Not completely right answer. Got only 7.03 points out of 10 points
		if ((kangaroo2StartingPosition - kangaroo1StartingPosition)
				% (kangaroo1JumpingDistance - kangaroo2JumpingDistance) == 0) {
			return "YES";
		}

		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");
		int x1 = Integer.parseInt(x1V1X2V2[0]);
		int v1 = Integer.parseInt(x1V1X2V2[1]);
		int x2 = Integer.parseInt(x1V1X2V2[2]);
		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		// bufferedWriter.write(result);
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		System.out.println(result);

		scanner.close();
	}
}