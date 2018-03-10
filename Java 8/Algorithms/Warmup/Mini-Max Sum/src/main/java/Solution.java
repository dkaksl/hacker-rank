import java.util.Arrays;
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
		try (Scanner in = new Scanner(System.in)) {
			int[] numbers = new int[5];
			for (int i = 0; i < 5; i++) {
				numbers[i] = in.nextInt();
			}
			Arrays.sort(numbers);
			int[] minArray = Arrays.copyOfRange(numbers, 0, 4);
			int[] maxArray = Arrays.copyOfRange(numbers, 1, 5);

			long min = 0;
			long max = 0;

			for (int i = 0; i < 4; i++) {
				min += minArray[i];
				max += maxArray[i];
			}

			System.out.println(min + " " + max);
		}
	}
}
