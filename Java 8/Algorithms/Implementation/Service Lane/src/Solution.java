import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int[] width = new int[N];
		for (int i = 0; i < N; i++) {
			width[i] = in.nextInt();
		}
		for (int i = 0; i < T; i++) {
			int entry = in.nextInt();
			int exit = in.nextInt();
			int min = 3;
			for (int j = entry; j <= exit; j++) {
				min = (width[j] < min) ? width[j] : min;
			}
			System.out.println(min);
		}
	}
}