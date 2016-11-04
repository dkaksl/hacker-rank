import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int t = in.nextInt();
			for (int a0 = 0; a0 < t; a0++) {
				long b = in.nextLong();
				long w = in.nextLong();
				long x = in.nextLong();
				long y = in.nextLong();
				long z = in.nextLong();

				long cost = 0;
				if (x < (y + z)) {
					cost += (b * x);
				} else {
					cost += ((y + z) * b);
				}
				if (y < (x + z)) {
					cost += (w * y);
				} else {
					cost += ((x + z) * w);
				}
				System.out.println(cost);
			}
		}
	}
}