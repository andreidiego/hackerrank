package io.andreidiego.algorithms.hackerrank.interviewpreparationkit.a_arrays.c_newyearchaos;

import java.util.Scanner;

public class Solution {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
        int minimumBribes = 0;
        int[] initialQueue = new int[q.length];
        
        for (int initialPosition = 0; initialPosition < q.length; initialPosition++) {
            int finalPosition = q[initialPosition];
            initialQueue[finalPosition - 1] = finalPosition;
            
            if (finalPosition > initialPosition + 3) {
                System.out.println("Too chaotic");
                return;
            }

            if (finalPosition > initialPosition + 1) {
                minimumBribes += (finalPosition - (initialPosition + 1));
            }
            
            if (finalPosition <= initialPosition + 1) {
                
                for (int i = 0; i < finalPosition; i++) {
                    if(initialQueue[i] == 0) {
                        minimumBribes += 1;
                    }
                }
            }
        }

        System.out.println(minimumBribes);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}