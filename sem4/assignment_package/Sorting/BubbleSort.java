package Sorting;

public class BubbleSort {
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
        sortedArray = s.BubbleSort(myArray);
        System.out.print("\nArray after sorting: ");
        for (int i = 0; i < len; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}

class Sort {
    int[] BubbleSort(int[] myArray) {
        int len = myArray.length;
        int temp;
        int numSteps = 0;
        System.out.println("\n\nBubble sort is starting: ");
        for (int i = 0; i < len; i++) {
            System.out.print("\nAfter pass " + (i + 1) + " : ");
            for (int j = 0; j < len - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    numSteps++;
                }
            }
            for (int k = 0; k < len; k++) {
                System.out.print(myArray[k] + " ");
            }
        }
        System.out.print("\n\nTotal number of steps: " + numSteps + "\n");
        return myArray;
    }
}
