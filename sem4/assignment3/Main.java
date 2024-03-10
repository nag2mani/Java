// Author: Nagmani Kumar
// Date: 10th March 2024
// Subject: Advance Java

import Stack.*;
import Queue.*;
import LinkedList.*;
import Searching.*;
import Sorting.*;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "What do you want to do?\n1. Searching \n2. Sorting or\n3. Data Structure(Stack,Queue,LinkedList)");

        int userinput = scanner.nextInt();

        if (userinput == 1) {
            System.out.println("Choose one of the following.\n1. Binary Search \n2. Linear Search");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter size of array to Search :");
                int size = scanner.nextInt();
                int[] arr = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.println("Enter number to put in the array:");
                    int num = scanner.nextInt();
                    arr[i] = num;
                }

                System.out.println("your Array : " + Arrays.toString(arr));
                System.out.println("Enter target element :");
                int target = scanner.nextInt();
                int n = arr.length;
                int indx = BinarySearch.binary_search(arr, 0, n, target);
                System.out.println("Your target element is at index " + indx);
            }

            else {

                System.out.println("Enter size of array to Search :");
                int size = scanner.nextInt();
                int[] arr = new int[size];

                for (int i = 0; i < size; i++) {
                    System.out.println("Enter number to put in the array:");
                    int num = scanner.nextInt();
                    arr[i] = num;
                }

                System.out.println("your Array : " + Arrays.toString(arr));
                System.out.println("Enter target element :");
                int target = scanner.nextInt();
                int n = arr.length;
                int indx = LinearSearch.linear_search(arr, n, target);
                System.out.println("Your target element is at index " + indx);
            }
            // scanner.close();
        }



        if (userinput == 2) {
            System.out.println("Enter the size of the array");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter number to put in the array:");
                int num = scanner.nextInt();
                arr[i] = num;
            }

            System.out.println("Your array: " + Arrays.toString(arr));
            System.out.println(
                    "Choose one from following sorting algorithms \n1. Bubble Sort \n2. Insertion Sort \n3. Selection Sort \n4. Quick Sort \n5. MergeSort");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Sorted array using Bubble Sort : "
                        + Arrays.toString(BubbleSort.bubble_sort(arr)));

            } else if (choice == 2) {
                System.out.println("Sorted array using InsertionSort : "
                        + Arrays.toString(InsertionSort.insertion_sort(arr)));

            } else if (choice == 3) {
                System.out.println("Sorted array using selection sort : "
                        + Arrays.toString(SelectionSort.selection_sort(arr)));

            } else if (choice == 4) {
                System.out.println("Sorted array using Quick sort : "
                        + Arrays.toString(QuickSort.quicksort(arr, 0, size - 1)));

            } else {
                System.out.println("Sorted array using merge sort : "
                        + Arrays.toString(MergeSort.merge_sort(arr, 0, size - 1)));
            }

            // scanner.close();
        }



        if (userinput == 3) {
            System.out.println("Choose one of the following.\n1. Stack \n2. Queue \n3. LinkedList");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the size of the stack :");
                int size = scanner.nextInt();
                Stack user_stack = new Stack(size);

                while (!user_stack.isFull()) {
                System.out.println("Enter number to push in the stack:");
                int e = scanner.nextInt();
                user_stack.push(e);
                }

                System.out.println("Choose operation in stack\n1. pop \n2. peek \n3. isFull \n4. isEmpty");
                int num = scanner.nextInt();

                if (num == 1) {
                System.out.println("Popped element :");
                System.out.println(user_stack.pop());

                } else if (num == 2) {
                System.out.println("First Element :");
                System.out.println(user_stack.peek());

                } else if (num == 3) {
                System.out.println("Stack is full :");
                System.out.println(user_stack.isFull());

                } else {
                System.out.println("Stack is empty :");
                System.out.println(user_stack.isEmpty());
                }
            }


            else if (choice == 2) {
                System.out.println("Enter the size of queue:");
                int size = scanner.nextInt();
                Queue q1 = new Queue(size);
                while (!q1.isFull()) {
                System.out.println("Enter elements for queue :");
                int e = scanner.nextInt();
                q1.enqueue(e);
                }
                q1.display();
                System.out.println("Choose operations from following \n1. remove \n2. front \n3. isEmpty \n4. isFull \n5. display");
                int num = scanner.nextInt();

                if (num == 1) {
                System.out.println("Deleted element :" + q1.dequeue());

                } else if (num == 2) {
                System.out.println("Front element " + q1.front);

                } else if (num == 3) {
                System.out.println("Queue is empty :" + q1.isEmpty());

                } else if (num == 4) {
                System.out.println("Queue is Full :" + q1.isFull());

                } else {
                System.out.println("Queue :");
                q1.display();
                }

            }



            else{
                    System.out.println("Enter the size of Linkedlist:");
                    int size = scanner.nextInt();
                    LinkedList ll1 = new LinkedList();

                    while (size > 0) {
                    System.out.println("Enter elements to insert in Linkedlist");
                    int e = scanner.nextInt();
                    ll1.insertNodeAtFirst(e);
                    size -= 1;

                    }
                    System.out.println("Your Linkedlist");
                    ll1.showElements();

                    System.out.println("Choose operations to perform \n1. insertFirst \n2. insertLast \n3. deleteFirst \n4. deleteLast \n5. Display Elements");
                    int choice3 = scanner.nextInt();

                    if (choice3 == 1) {
                    // System.out.println();
                    System.out.println("Enter element to insert at first");
                    int num = scanner.nextInt();
                    ll1.insertNodeAtFirst(num);

                    } else if (choice3 == 2) {
                    System.out.println("Enter element to insert at Last");
                    int num = scanner.nextInt();
                    ll1.insertNodeAtLast(num);

                    } else if (choice3 == 3) {
                        ll1.deleteAtFirst();;
    
                    }else if (choice3 == 4) {
                    ll1.deleteAtLast();

                    } else if (choice3 == 5) {
                    System.out.println("Linkedlist :");
                    ll1.showElements();
                    }
            }
        }

        scanner.close();
    }
}