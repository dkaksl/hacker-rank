import java.util.Scanner;

public class Solution {

	private static int E = 100;
	private static int location = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		jump(c, k, n);
		while (location != 0) {
			jump(c, k, n);
		}
		System.out.println(E);
	}

	private static void jump(int[] c, int k, int n) {
		E -= 1;
		location = (location + k) % n;
		if (c[location] == 1) {
			E -= 2;
		}
	}
}
