import java.util.*;

class Insertarr {
	public static void main(String args[]) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size array");
		int len = s1.nextInt();
		System.out.println("Enter location want to insert");
		int num = s1.nextInt();
		System.out.println("Enter number want to insert");
		int n = s1.nextInt();
		int[] c = new int[len + 1];
		int[] a = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("enter value" + i + "index");
			a[i] = s1.nextInt();
		}
		for (int j = 0; j < num; j++) {

			c[j] = a[j];
		}
		int km = num;
		for (int i = num + 1; i < len; i++) {
			c[i] = a[km];
			km++;
		}
		c[num] = n;

		for (int i = 0; i <= len; i++) {
			System.out.println("enter value" + i + "index" + c[i]);
		}
	}
}