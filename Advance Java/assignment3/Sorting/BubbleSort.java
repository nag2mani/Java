package Sorting;


public class BubbleSort {

    // bubble sort algorithm
    public static int[] bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    //Swapping function
    public static void Swap(int[] arr, int j, int i) {
        int var = arr[j];
        arr[j] = arr[i];
        arr[i] = var;
    }
}
