package Sorting;

class SelectionSort {
    public static void main(String[] args) {
        int len = args.length;
        int myArray[] = new int[len];
        int[] sortedArray = new int[len];

        System.out.print("Array before sorting: ");
        for (int i = 0; i < len; i++) {
            myArray[i] = Integer.parseInt(args[i]);
            System.out.print(myArray[i] + " ");
        }

        Sort s = new Sort();
        sortedArray = s.SelectionSort(myArray);
        System.out.print("\nArray after sorting: ");
        for (int i = 0; i < len; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        System.out.println();
    }
}

class Sort {
    int[] SelectionSort(int[] a) {
        int i, j, small;
        int n = a.length;
        int steps = 0;
        System.out.println("\nSelection sort is starting....");
        for (i = 0; i < n - 1; i++) {
            small = i; // minimum element in unsorted array

            for (j = i + 1; j < n; j++) {
                if (a[j] < a[small]) {
                    steps++;
                    small = j;
                }

                // Swap the minimum element with the first element
                int temp = a[small];
                a[small] = a[i];
                a[i] = temp;
            }
            System.out.print("\nAfter pass " + (i + 1) + " : ");

            for (int k = 0; k < n; k++) {

                System.out.print(a[k] + " ");
            }

        }
        System.out.print("Total number of steps: " + steps);
        return a;
    }
}
