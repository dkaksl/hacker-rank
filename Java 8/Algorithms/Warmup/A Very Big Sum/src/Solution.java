import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int count = Integer.parseInt(in.nextLine());
			String[] rawData = in.nextLine().split(" ");
			long sum = 0;
			for (int i = 0; i < rawData.length; i++) {
				sum += Integer.parseInt(rawData[i]);
			}
			System.out.println(sum);
		}
	}
}