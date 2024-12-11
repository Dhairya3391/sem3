import java.util.*;

public class Odd {
	public static void main(String args[]) {
		int y;
		Scanner s = new Scanner(System.in);
		y = s.nextInt();
		if (y % 2 == 0) {
			System.out.println("The number is even");
		}
		if (y % 2 == 1) {
			System.out.println("The number is odd");
		}
	}
}
