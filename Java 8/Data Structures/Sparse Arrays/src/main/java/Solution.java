import java.util.ArrayList;
import java.util.List;
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
			int N = Integer.parseInt(in.nextLine().trim());
			List<String> strings = new ArrayList<String>();
			for (int i = 0; i < N; i++) {
				strings.add(in.nextLine());
			}
			int Q = Integer.parseInt(in.nextLine().trim());
			for (int i = 0; i < Q; i++) {
				String query = in.nextLine();
				int occurrences = 0;
				for (String s : strings) {
					if (s.equals(query)) {
						occurrences++;
					}
				}
				System.out.println(occurrences);
			}
		}
	}
}
