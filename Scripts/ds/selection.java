import java.util.*;

class selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, j, size, temp;

        System.out.print("Enter Array Size : ");
        size = sc.nextInt();

        System.out.print("Enter Array Elements : ");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < size; i++) {
            int min = i;
            for (j = i + 1; j < size; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }

        System.out.println("after the selection sort");

        for (i = 0; i < size; i++) {
            System.out.println("the array are " + "index  " + i + "  " + a[i] + " ");
        }
    }

}
