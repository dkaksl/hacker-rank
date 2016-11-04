import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int x1 = in.nextInt();
			int v1 = in.nextInt();
			int x2 = in.nextInt();
			int v2 = in.nextInt();
			if (doesCrash(x1, v1, x2, v2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean doesCrash(int x1, int v1, int x2, int v2) {
		if (v2 >= v1) {
			return false;
		} else {
			while (true) {
				x1 += v1;
				x2 += v2;
				if (x1 == x2) {
					return true;
				} else if (x1 > x2) {
					return false;
				}
			}
		}
	}
}