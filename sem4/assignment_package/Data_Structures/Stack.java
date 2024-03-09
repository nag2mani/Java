package Data_Structures;

public class Stack {

    int n;

    int arr[]; // Array to store the elements of the stack

    int top; // Index of the top element of the stack

    Stack(int n) { // Constructor to create an empty stack with a specified size(n)

        this.n = n;

        this.arr = new int[n];

        this.top = -1; // The stack is initially empty, so top is set to -1

    }

    public boolean isEmpty() {

        return (top == -1);

    }

    public boolean isFull() {

        return (n - 1 == top);

    }

    // Pushes an element onto the top of the stack

    public void push(int pushedElement) {

        if (!isFull()) {

            top++;

            arr[top] = pushedElement;

            System.out.println("Pushed element:" + pushedElement);

        } else {

            System.out.println("Stack is full !"); // Overflow

        }

    }

    // Removes and returns the element at the top of the stack

    public int pop() {

        if (!isEmpty()) {

            int poppedElement = top;

            top--;

            System.out.println("Popped element :" + arr[poppedElement]);

            return arr[poppedElement];

        } else {

            System.out.println("Stack is empty!");

            return -1;

        }

    }

    // Returns the element at the top of the stack without removing it

    public int peek() {

        if (!this.isEmpty())

            return arr[top];

        else {

            System.out.println("Stack is Empty");

            return -1;

        }

    }

    public static void main(String[] args) {

        Stack st = new Stack(5); // Create a new stack with a size of 5

        st.pop();

        st.push(1);

        st.push(2);

        st.push(3);

        st.pop();

        st.pop();

        st.pop();

    }

}
