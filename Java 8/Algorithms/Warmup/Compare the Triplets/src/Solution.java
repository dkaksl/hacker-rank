import java.util.Scanner;

public class Solution {

	private static int aliceScore = 0;
	private static int bobScore = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		evaluateScores(a0, b0);
		evaluateScores(a1, b1);
		evaluateScores(a2, b2);

		System.out
				.println("$A $B".replace("$A", Integer.toString(aliceScore)).replace("$B", Integer.toString(bobScore)));
	}

	private static void evaluateScores(int a, int b) {
		if (a == b) {
			return;
		}
		if (a > b) {
			aliceScore += 1;
		} else if (b > a) {
			bobScore += 1;
		}
	}

}
