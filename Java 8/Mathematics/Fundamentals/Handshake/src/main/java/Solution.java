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
			int T = in.nextInt();
			for (int i = 0; i < T; i++) {
				int N = in.nextInt();
				System.out.println((N * (N - 1)) / 2); // N! / R!(N - R)! 
			}
		}
	}
}
