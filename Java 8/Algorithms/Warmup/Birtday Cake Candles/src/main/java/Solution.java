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
			int age = in.nextInt();
			int maxHeight = 0;
			int count = 0;

			for (int i = 0; i < age; i++) {
				int height = in.nextInt();
				if (height > maxHeight) {
					count = 1;
					maxHeight = height;
				} else if (height == maxHeight) {
					count++;
				} else {
					continue;
				}
			}
			System.out.println(count);
		}
	}
}
