import java.util.*;

//shell shot
class shellsort {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        shellsort1(a, n);
        System.out.println("sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void shellsort1(int a[], int n) {
        int i, j, k, temp;
        for (k = n / 2; k > 0; k = k / 2) {
            for (i = k; i < n; i++) {
                temp = a[i];
                for (j = i; j >= k && a[j - k] > temp; j = j - k) {
                    a[j] = a[j - k];
                }
                a[j] = temp;
            }
        }
    }
}
