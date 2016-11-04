import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int height = 1;
			for (int j = 0; j < N; j++) {
				if (j % 2 == 0) {
					height *= 2;
				} else {
					height += 1;
				}
			}
			System.out.println(height);
		}
	}
}