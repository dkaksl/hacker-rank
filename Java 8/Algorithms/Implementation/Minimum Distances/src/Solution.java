import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int A[] = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = in.nextInt();
			}
			int min = n;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					if (i == j) {
						continue;
					}
					if (A[i] == A[j]) {
						int newMin = j - i;
						if (newMin < min) {
							min = newMin;
						}
					}
				}
			}
			if (min == n) {
				System.out.println(-1);
			} else {
				System.out.println(min);
			}
		}
	}
}