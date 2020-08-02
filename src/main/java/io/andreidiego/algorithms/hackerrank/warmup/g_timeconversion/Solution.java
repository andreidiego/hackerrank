package io.andreidiego.algorithms.hackerrank.warmup.g_timeconversion;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		String amPmTime = scan.next();
		String hour = amPmTime.substring(0, 2);
		String timeQualifier = amPmTime.substring(amPmTime.length() - 2, amPmTime.length());

		if ("PM".equals(timeQualifier)) {
			
			if(!"12".equals(hour))
				hour = String.valueOf(Integer.parseInt(hour) + 12);
			
		} else if ("12".equals(hour)) {
			hour = "00";
		}

		System.out.println(hour + amPmTime.substring(2, amPmTime.length() - 2));
		scan.close();
	}
}