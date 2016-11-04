import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int L = in.nextInt();
			int R = in.nextInt();
			int max = 0;
			for (int i = 0; i <= (R - L); i++) {
				for (int j = 0; j <= (R - L); j++) {
					int candidate = ((L + i) ^ (L + j));
					max = (candidate > max) ? candidate : max;
				}
			}
			System.out.println(max);
		}
	}
}