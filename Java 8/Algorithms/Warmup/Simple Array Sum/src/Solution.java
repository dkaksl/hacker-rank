import java.io.BufferedInputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new BufferedInputStream(System.in))) {
			int size = Integer.parseInt(scanner.nextLine());
			String[] numbers = scanner.nextLine().split(" ");
			int sum = 0;
			for (String number : numbers) {
				sum += Integer.parseInt(number);
			}
			System.out.println(sum);
		}
	}

}