public class BubbleSort {
    public static void main(String[] args) {

        int[] b = {1, 4, 5, 8, 9, 33, 15, 2, 24, 6, 9};

        // Outer loop for the number of passes
        for (int j = 0; j < b.length - 1; j++) {

            // Inner loop for each pass
            for (int i = 0; i < b.length - 1 - j; i++) {

                // Compare adjacent elements and swap if necessary
                if (b[i] > b[i + 1]) {
                    int temp = b[i + 1];
                    b[i + 1] = b[i];
                    b[i] = temp;
                }
            }
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
