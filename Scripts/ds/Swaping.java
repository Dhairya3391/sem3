import java.util.*;

class Swaping {
	static int x = 0, y = 0;

	public void swap() {
		int temp;
		temp = x; // x=x+y, //y=x-y, // x=x-y
		x = y;
		y = temp;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		x = sc.nextInt();
		System.out.println("Enter 2nd value");
		y = sc.nextInt();
		Swaping s1 = new Swaping();
		System.out.println("Before Swap" + "1st value" + "is" + x);
		System.out.println("Before Swap" + "2nd value" + "is" + y);
		System.out.println();

		s1.swap();
		System.out.println("after Swap" + "1st value" + "is" + x);
		System.out.println("after Swap" + "2nd value" + "is" + y);

	}
}