package Sorting;



public class QuickSort {

    //Swapping of two elements.
    public static void Swap(int[] arr, int j, int i) {
        int var = arr[j];
        arr[j] = arr[i];
        arr[i] = var;
    }

    //Quicksort
    public static int[] quicksort(int[] arr, int s, int e) {
        if (s >= e) {
            return arr;
        }
        int partIndx = partition(arr, s, e);
        quicksort(arr, s, partIndx - 1);
        quicksort(arr, partIndx + 1, e);
        return arr;
    }

    //partition function.
    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                Swap(arr, i, j);
            }
        }
        Swap(arr, i + 1, e);
        return i + 1;
    }
}

