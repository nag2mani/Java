class binarysearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                return binarySearch(arr, l, mid - 1, x);
            }
            else{
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        binarysearch ob = new binarysearch();
        int arr[] = { 1,2, 3, 4, 10, 12,40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result);
    }
}
