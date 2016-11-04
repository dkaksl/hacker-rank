import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int size = Integer.parseInt(scanner.nextLine());
			int[][] data = new int[size][size];
			for (int i = 0; i < size; i++) {
				data[i] = getData(scanner.nextLine().split(" "));
			}

			int d1 = getDiagonalSum(getDiagonal1(data));
			int d2 = getDiagonalSum(getDiagonal2(data));

			System.out.println(Math.abs(d1 - d2));
		}
	}

	private static int getDiagonalSum(int[] diagonal) {
		int sum = 0;
		for (int i = 0; i < diagonal.length; i++) {
			sum += diagonal[i];
		}
		return sum;
	}

	private static int[] getDiagonal1(int[][] lines) {
		int size = lines[0].length;
		int[] diagonal = new int[size];
		for (int i = 0; i < size; i++) {
			diagonal[i] = lines[i][i];
		}
		return diagonal;
	}

	private static int[] getDiagonal2(int[][] lines) {
		int size = lines[0].length;
		int[] diagonal = new int[size];
		for (int i = 0; i < size; i++) {
			diagonal[i] = lines[i][size - 1 - i];
		}
		return diagonal;
	}

	private static int[] getData(String[] rawData) {
		int[] data = new int[rawData.length];
		for (int i = 0; i < rawData.length; i++) {
			data[i] = Integer.parseInt(rawData[i]);
		}
		return data;
	}
}