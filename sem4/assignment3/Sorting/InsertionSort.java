package Sorting;

public class InsertionSort {

    // insertion sort algorithm.
    public static int[] insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                Swap(arr, j, j + 1);
                j -= 1;
            }
        }
        return arr;
    }

    //swapping algorithm.
    public static void Swap(int[] arr, int j, int i) {
        int var = arr[j];
        arr[j] = arr[i];
        arr[i] = var;
    }
}
