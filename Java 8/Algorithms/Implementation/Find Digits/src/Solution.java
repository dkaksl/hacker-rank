import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int T = in.nextInt();
			for (int i = 0; i < T; i++) {
				int number = in.nextInt();
				String numberString = Integer.toString(number);
				int numberStringLength = numberString.length();
				int count = 0;
				for (int j = 0; j < numberStringLength; j++) {
					int digit = Character.getNumericValue(numberString.charAt(j));
					if (digit != 0) {
						if (number % digit == 0) {
							count++;
						}
					}
				}
				System.out.println(count);
			}
		}

	}
}