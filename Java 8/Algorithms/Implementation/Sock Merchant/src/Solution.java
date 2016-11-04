import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer c[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		List<Integer> list = Arrays.asList(c);
		Set<Integer> set = new HashSet<Integer>(list);
		int count = 0;
		for (Integer number : set) {
			count += Collections.frequency(list, number) / 2;
		}
		System.out.println(count);
	}

}
