import java.util.*;

class Queue {
	static int n = 5;
	static int arr[] = new int[n];
	int f = -1, r = -1;
	int x = 0;

	void enqueue(int x) {
		if (r == n) {
			System.out.println("Queue overflow");
    

		} else if (f == -1) {
			f++;
			r++;
			arr[r] = x;

		} else {
			r++;
			arr[r] = x;

		}

	}

	void dequeue() {
		if (f == -1) {
			System.out.println("Queue Underflow");
		} else if (f == r) {
			arr[f] = 0;
			f = r = -1;

		} else {
			x = arr[f];
			arr[f] = 0;
			f++;

		}
	}

	public static void main(String[] args) {

		Queue q1 = new Queue();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		switch (s) {
			case 1:
				System.out.println("Enter number you want to enter");
				int x = sc.nextInt();
				q1.enqueue(x);

				break;

			case 2:
				q1.dequeue();
				break;

		}

		for (int j = 0; j < n; j++) {
			System.out.println("Index" + j + "Element is=" + arr[j]);
		}

	}
}