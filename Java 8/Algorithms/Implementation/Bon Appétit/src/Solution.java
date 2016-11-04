import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int bSum = 0;
			int bCharged = in.nextInt();
			for (int i = 0; i < n; i++) {
				bSum += a[i];
			}
			int bActual = (bSum / 2) - (a[k] / 2);
			if (bCharged == bActual) {
				System.out.println("Bon Appetit");
			} else {
				System.out.println(bCharged - bActual);
			}
		}
	}
}