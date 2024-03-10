package Sorting;


public class SelectionSort {

    
    //selection sort algorithm.
    public static int[] selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int min_indx=findMinimum(arr,i);
            if (arr[min_indx]<temp){
                Swap(arr,i,min_indx);
            }
        }
        return arr;
    }

    // find minimum in an array.
    public static int findMinimum(int[] arr, int i) {
        int min=i;
        for (int j = i; j < arr.length; j++) {
            if (arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
    }

    //swapping method.
    public static void Swap(int[] arr, int j, int i) {
        int var=arr[j];
        arr[j]=arr[i];
        arr[i]=var;
    }
}