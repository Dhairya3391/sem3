import java.util.*;

public class Sum {
	public static void main(String[] args) {

		int s, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The starting");
		s = sc.nextInt();
		System.out.println("Enter the ending");
		n = sc.nextInt();

		for (int i = s; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println("Sum of all is" + sum);
	}
}