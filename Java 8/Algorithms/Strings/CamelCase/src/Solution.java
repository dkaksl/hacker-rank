import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(in.nextLine().replaceAll("[A-Z]", " ").split(" ").length);
		}
	}
}
