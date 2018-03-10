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
			int[][] A = new int[6][6];
			for (int y = 0; y < 6; y++) {
				for (int x = 0; x < 6; x++) {
					A[y][x] = in.nextInt();
				}
			}
			int maxSum = 0;
			for (int y = 1; y < 4; y++) {
				for (int x = 1; x < 4; x++) {
					int newSum = sumHourGlass(A, x, y);
					maxSum = (newSum > maxSum) ? newSum : maxSum;
				}
			}
			System.out.println(maxSum);
		}
	}

	private static int sumHourGlass(int[][] A, int x, int y) {
		return //
		A[x - 1][y - 1] + A[x][y - 1] + A[x + 1][y - 1] + //
				A[x][y] +//
				A[x - 1][y + 1] + A[x][y + 1] + A[x + 1][y + 1];
	}
}
