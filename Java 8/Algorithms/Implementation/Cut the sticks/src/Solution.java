import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			Integer[] sticks = new Integer[in.nextInt()];
			for (int i = 0; i < sticks.length; i++) {
				sticks[i] = in.nextInt();
			}
			while (sticks.length > 0) {
				System.out.println(sticks.length);
				sticks = getCutSticks(sticks);
			}
		}
	}

	private static int getSmallestNumber(Integer[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			smallest = (smallest < number) ? smallest : number;
		}
		return smallest;
	}

	private static Integer[] getCutSticks(Integer[] sticks) {
		List<Integer> newSticks = new ArrayList<Integer>();
		int smallest = getSmallestNumber(sticks);
		for (int i = 0; i < sticks.length; i++) {
			int cutStick = sticks[i] - smallest;
			if (cutStick > 0) {
				newSticks.add(cutStick);
			}
		}
		return newSticks.toArray(new Integer[0]);
	}
}