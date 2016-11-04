import java.util.Scanner;

public class Solution {

	private static int lonelyInteger(int[] a) {
		int lonelyInteger = 0;
		for (int i = 0; i < a.length; i++) {
			lonelyInteger ^= a[i];
		}
		return lonelyInteger;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
	}

}