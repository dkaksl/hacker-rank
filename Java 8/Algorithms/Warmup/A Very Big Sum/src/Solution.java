import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		String[] rawData = scanner.nextLine().split(" ");
		long sum = 0;
		for (int i = 0; i < rawData.length; i++) {
			sum += Integer.parseInt(rawData[i]);
		}
		System.out.println(sum);
	}
}