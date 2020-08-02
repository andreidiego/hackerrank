package io.andreidiego.algorithms.hackerrank.problemsolving.a_warmup.c_comparethetriplets;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aliceResult = 0;
		int bobResult = 0;

		for (int i = 0; i < a.size(); i++) {
			Integer alicePoints = a.get(i);
			Integer bobPoints = b.get(i);

			if (alicePoints > bobPoints) {
				aliceResult++;

			} else if (bobPoints > alicePoints) {
				bobResult++;
			}

		}

		return new ArrayList<>(Arrays.asList(aliceResult, bobResult));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		// bufferedWriter.write(result.stream().map(Object::toString).collect(joining("
		// ")) + "\n");
		System.out.println(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		// bufferedWriter.close();
	}
}