import java.util.*;

public class SelectionSort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number at" + i + "index");
            arr[i] = sc.nextInt();
        }
        for (int i = i + 1; i < n - 1; i++) {
            if (arr[i] < arr[mid]) {
                mid = i;
            }
            if (mid != pass) {
                int temp = arr[pass];
                arr[pass] = arr[mid];
                arr[mid] = temp;
            }
        }
    }
}
