import java.util.Random;

/* Online Java Compiler and Editor */
public class Compare {

    void print(int a[]) // function to print array elements
    {
        int n = a.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }


    void bubbleSort(int a[]) // function to implement bubble sort
    {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        Random rd = new Random();
        int[] a = new int[1000];
        for (int i =0; i < a.length; i++){
            a[i] = rd.nextInt(1000);
        }

        Compare b1 = new Compare();
        System.out.println("Before sorting array elements are - ");
        b1.print(a);
        b1.bubbleSort(a);
        System.out.println();

        System.out.println("After sorting array elements are - ");
        b1.print(a);

        long end = System.currentTimeMillis();
        System.out.println("\nTotal runtime: " + (end - start) + " miliseconds");
    }
}