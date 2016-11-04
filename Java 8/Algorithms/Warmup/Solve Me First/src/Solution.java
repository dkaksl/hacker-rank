import java.util.Scanner;

public class Solution {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(in.nextInt() + in.nextInt());
		}
	}
}
