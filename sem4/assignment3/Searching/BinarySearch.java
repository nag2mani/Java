package Searching;


public class BinarySearch {

    //binary search method.
    public static int binary_search(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binary_search(arr, l, mid - 1, x);
            return binary_search(arr, mid + 1, r, x);
        }
        return -1;
    }
}

