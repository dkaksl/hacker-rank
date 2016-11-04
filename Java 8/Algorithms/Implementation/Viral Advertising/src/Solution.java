import java.util.Scanner;

public class Solution {

	private static int likers = 0;
	private static int advertisees = 5;

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int days = in.nextInt();
			for (int i = 0; i < days; i++) {
				addLikers();
			}
			System.out.println(likers);
		}
	}

	private static void addLikers() {
		int newLikers = advertisees / 2;
		likers += newLikers;
		advertisees = (newLikers * 3);
	}
}