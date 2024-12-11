import java.util.*;

public class Linear_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");

        int n = sc.nextInt();
        int flag = 0;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number at" + i + "index");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number want to find");
        int num = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (num == arr[i]) {
                flag = 1;
                if (flag == 1) {
                    System.out.println("Serch success" + i);
                } else if (flag == 0) {
                    System.out.println("Serch unsuccessful");
                }
            }

        }

    }

}
