import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int size = Integer.parseInt(in.nextLine());
			char[][] map = new char[size][size];
			for (int i = 0; i < size; i++) {
				String line = in.nextLine();
				for (int j = 0; j < size; j++) {
					map[i][j] = line.charAt(j);
				}
			}

			for (int i = 1; i < size - 1; i++) {
				for (int j = 1; j < size - 1; j++) {
					if (map[i - 1][j] < map[i][j] && map[i + 1][j] < map[i][j] && map[i][j - 1] < map[i][j]
							&& map[i][j + 1] < map[i][j]) {
						map[i][j] = 'X';
					}
				}
			}

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}