package Sorting;


public class MergeSort {
    public static int[] merge_sort(int[] arr, int low, int high){
        int mid;
        if (low<high){
            mid=(low+high)/2;
            int[] left= merge_sort(arr,low,mid);
            int[] right=merge_sort(arr,mid+1,high);
            return merge(left,right);
        }
        return new int[]{arr[low]};
    }


    //Merging two array;
    public static int[] merge(int[] left, int[] right) {
        int result[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
    
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
    
        while (i < left.length) {
            result[k++] = left[i++];
        }
    
        while (j < right.length) {
            result[k++] = right[j++];
        }
    
        return result;
    }

    
    //Printing sorted array
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


