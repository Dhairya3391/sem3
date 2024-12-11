import java.util.*;

// merge sort
class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the pivot element: ");
        int pivot = sc.nextInt();
        mergeSort(arr, 0, arr.length - 1, pivot);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high, int pivot) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, pivot);
            mergeSort(arr, mid + 1, high, pivot);
            merge(arr, low, mid, high, pivot);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high, int pivot) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int temp[] = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (arr[i] < pivot && arr[j] < pivot) {
                temp[k++] = arr[i++];
            } else if (arr[i] >= pivot && arr[j] < pivot) {
                temp[k++] = arr[j++];
            } else if (arr[i] < pivot && arr[j] >= pivot) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
}
