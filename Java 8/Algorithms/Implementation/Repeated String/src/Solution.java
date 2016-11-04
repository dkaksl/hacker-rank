import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int sLength = s.length();
		long n = in.nextLong();
		int aCount = 0;
		for (int i = 0; i < sLength; i++) {
			if (s.charAt(i) == 'a') {
				aCount++;
			}
		}
		long count = (n / sLength) * aCount;
		for (int i = 0; i < (n % sLength); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
