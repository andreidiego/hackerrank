package io.andreidiego.algorithms.hackerrank.problemsolving.a_warmup.j_timeconversion;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		boolean isAM = s.indexOf("AM") != -1;
		String hour = s.substring(0, 2);

		if (isAM && hour.equals("12")) {
			hour = "00";

		} else if (!isAM && !hour.equals("12")) {
			hour = String.valueOf(Integer.parseInt(hour) + 12);
		}

		return hour + s.substring(2, 8);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		// bw.write(result);
		// bw.newLine();
		//
		// bw.close();

		System.out.println(result);
	}
}