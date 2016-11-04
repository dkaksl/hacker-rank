import java.util.Scanner;

public class Solution {

	private static int positiveCount = 0;
	private static int negativeCount = 0;
	private static int zeroCount = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double length = (double) Integer.parseInt(scanner.nextLine());
		countNumbers(getNumbers(scanner.nextLine()));

		System.out.println(positiveCount / length);
		System.out.println(negativeCount / length);
		System.out.println(zeroCount / length);
	}

	private static void countNumbers(int[] numbers) {
		for (int number : numbers) {
			if (number > 0) {
				positiveCount++;
			} else if (number < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}
	}

	private static int[] getNumbers(String input) {
		String[] rawNumbers = input.split(" ");
		int[] numbers = new int[rawNumbers.length];
		for (int i = 0; i < rawNumbers.length; i++) {
			numbers[i] = Integer.parseInt(rawNumbers[i]);
		}
		return numbers;
	}
}