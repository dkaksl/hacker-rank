import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	private static int[] array = null;

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int k = in.nextInt();
			int q = in.nextInt();
			Integer[] array = new Integer[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
			}
			Collections.rotate(Arrays.asList(array), k);
			for (int i = 0; i < q; i++) {
				int m = in.nextInt();
				System.out.println(array[m]);
			}
		}
	}
}