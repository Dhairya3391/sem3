import java.util.*;

//Bucket sort
public class BucketSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bucketSort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bucketSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int bucketCount = (max - min) / arr.length + 1;
        int[] bucket = new int[bucketCount];
        for (int i = 0; i < n; i++) {
            bucket[(arr[i] - min) / arr.length]++;
        }
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                arr[index++] = min + i;
            }
        }
    }
}
