import java.util.Scanner;

/** 
 * 
 * Copyright (C) 2018 Amani
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */

/**
 * @author Amani
 *
 */
public class Solution {
	public static void main(String[] args) {
		long min = 1000000000;
		long max = 0;

		try (Scanner in = new Scanner(System.in)) {
			int[] numbers = new int[5];
			for (int i = 0; i < 5; i++) {
				numbers[i] = in.nextInt();
			}

			for (int i = 0; i < numbers.length; i++) {
				long sum = 0;
				for (int j = 0; j < numbers.length; j++) {
					if (i == j) {
						continue;
					}
					sum += numbers[j];
				}
				min = (sum < min) ? sum : min;
				max = (sum > max) ? sum : max;
			}
		}

		System.out.println(min + " " + max);
	}
}
