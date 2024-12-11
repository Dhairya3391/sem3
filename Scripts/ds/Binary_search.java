
import java.util.*;

public class Binary_search {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number at" + i + "index");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number want to find");
        int num = sc.nextInt();
        int flag = 0, mid = 0;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            mid = left + right / 2;
            if (arr[mid] == num) {
                flag = 1;
                System.out.println("search success" + mid);
                break;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("search unsuccess");
        }

    }

}
