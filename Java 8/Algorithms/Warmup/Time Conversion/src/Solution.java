import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws ParseException {
		try (Scanner in = new Scanner(System.in)) {
			String input = in.nextLine();

			SimpleDateFormat oldFormat = new SimpleDateFormat("hh:mm:ssa", Locale.ENGLISH);
			Date date = oldFormat.parse(input);
			SimpleDateFormat newFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
			System.out.println(newFormat.format(date));
		}
	}
}