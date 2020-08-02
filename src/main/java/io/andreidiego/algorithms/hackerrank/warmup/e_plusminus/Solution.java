package io.andreidiego.algorithms.hackerrank.warmup.e_plusminus;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. 
         * Read input from STDIN. 
         * Print output to STDOUT. 
         * Your class should be named Solution. 
         */
    	
    	Scanner scan = new Scanner(System.in);
		int arraySyze = scan.nextInt();
		float zeroes = 0, positives = 0, negatives = 0;
    	
    	for(int i = 0; i < arraySyze; i++) {
    		int nextElement = scan.nextInt();
    		
			if (nextElement > 0)
    			positives++;

			if (nextElement < 0)
    			negatives++;
			
			if (nextElement == 0)
				zeroes++;
    	}
    	
    	scan.close();
    	
    	System.out.println(String.format("%.6f", positives/arraySyze));
    	System.out.println(String.format("%.6f", negatives/arraySyze));
    	System.out.println(String.format("%.6f", zeroes/arraySyze));
    }
}