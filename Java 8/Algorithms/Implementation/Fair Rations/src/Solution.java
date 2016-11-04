import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int B[] = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt();
			sum += B[i];
		}

		if (sum % 2 != 0) {
			System.out.println("NO");
		} else {
			int count = 0;
			for (int i = 0; i < N; i++) {
				if ((B[i] % 2) != 0) {
					B[i + 1] = B[i + 1] + 1;
					count += 2;
				}
			}
			System.out.println(count);
		}
	}
}
