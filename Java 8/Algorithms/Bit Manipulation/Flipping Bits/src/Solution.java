import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long T = in.nextLong();
		for (int i = 0; i < T; i++) {
			System.out.println((Long.MAX_VALUE & 0xFFFFFFFFL) ^ in.nextLong());
		}
	}
}