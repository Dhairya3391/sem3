import java.util.*;
import java.lang.*;

public class Nnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The legnth");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("The element is" + i);
			arr[i] = sc.nextInt();

		}
		for (int j = 0; arr[j] < len; j++) {
			System.out.println("The element is" + j);
		}
	}
}