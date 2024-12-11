import java.util.*;

class bubble {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, j, size, temp;

        System.out.print("Enter Array Size : ");
        size = sc.nextInt();

        for (i = 0; i < size; i++) {
            System.out.print("Enter Array Elements : ");
            a[i] = sc.nextInt();
        }

        System.out.println("now to apply the bubble sort");

        for (i = 0; i < size - 1; i++) {

            for (j = 0; j < size - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("after the bubble sort");

        for (i = 0; i < size; i++) {
            System.out.println("the array are " + "index" + i + " " + a[i] + " ");
        }
    }

}
