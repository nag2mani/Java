import java.util.Arrays;

class Sorting {

    public void swap(int i, int j){
        int temp = i;
        j = i;
        i = temp;
    }

    public void insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int j = i-1;
            while (j < n) {
                if (arr[i] >= arr[j]){
                    swap(arr[i], arr[j]);
                }
                j = j + 1;
            }
        }
    }
}


public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {88, 0, 12, 11, 13, 5, 6};
        Sorting b = new Sorting();
        b.insertion_sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

