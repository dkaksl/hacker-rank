import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		for (int i = 0; i < width; i++) {
			char[] spaces = new char[width - 1 - i];
			Arrays.fill(spaces, ' ');
			char[] hashes = new char[i + 1];
			Arrays.fill(hashes, '#');
			System.out.println(new String(spaces) + new String(hashes));
		}
	}
}