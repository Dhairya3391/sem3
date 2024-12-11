import java.util.*;

class cirque {
    static int n = 5;
    static int arr[] = new int[n];
    int f = -1, r = -1;
    int x = 0;

    void enqueue(int x) {
        for (int i = 0; i < n; i++) {
            if (r == n - 1) {
                r = 0;
            }
            if (f == 0 && r == n - 1) {
                System.out.println("Cirqueue Overflow");
                break;
            }
            if (f == -1) {
                r++;
                f++;
                arr[r] = x;
                break;
            } else {
                r++;
                arr[r] = x;
                break;
            }

        }
    }

    void dequeue() {
        for (int i = 0; i < n; i++) {
            if (f == -1 && r == -1) {
                System.out.println("Cirque underflow");
            }
            if (f == 0) {
                arr[f] = 0;
                f++;
                break;
            } else {
                arr[f] = 0;
                f++;
                break;
            }
        }
    }

    public static void main(String[] args) {

        cirque q1 = new cirque();
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