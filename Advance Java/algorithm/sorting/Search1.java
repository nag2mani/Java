public class Search1 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("input numbers and last number is your target");
            System.exit(1);
        }

        // Parse the list of integers from command line arguments
        int[] sortedList = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            sortedList[i] = Integer.parseInt(args[i]);
        }

        // Parse the target value from the last command line argument
        int target = Integer.parseInt(args[args.length - 1]);

        // Perform binary search
        int result = binarySearch(sortedList, target);

        // Display the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the list.");
        }
    }


    // Binary Search function
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
}
