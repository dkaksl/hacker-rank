import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int c[] = new int[n];
			for (int i = 0; i < n; i++) {
				c[i] = in.nextInt();
			}
			int steps = 0;
			int location = 0;
			while (location < n) {
				if (location == n - 2) {
					steps++;
					break;
				}
				if (c[location + 2] == 0) {
					location += 2;
				} else if (c[location + 1] == 0) {
					location++;
				}
				steps++;
				if (location == n - 1) {
					break;
				}
			}
			System.out.println(steps);
		}
	}
}