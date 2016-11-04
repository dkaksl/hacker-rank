import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int testCases = in.nextInt();
			for (int i = 0; i < testCases; i++) {
				int studentCount = in.nextInt();
				int threshold = in.nextInt();
				int[] students = new int[studentCount];
				for (int j = 0; j < studentCount; j++) {
					students[j] = in.nextInt();
				}
				if (isCanceled(threshold, students)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

	private static boolean isCanceled(int threshold, int[] students) {
		int onTimeStudents = 0;
		for (int student : students) {
			if (student <= 0) {
				onTimeStudents++;
			}
		}
		return onTimeStudents < threshold;
	}
}