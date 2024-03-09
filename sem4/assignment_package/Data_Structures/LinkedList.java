package Data_Structures;

public class LinkedList {
    // Represent a node of the singly linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Represent the head and tail of the singly linked list

    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);
        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Add nodes to the list
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        // Displays the nodes present in the list
        ll.display();
    }
}





// Program 2: To insert, delete at any position including size of

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertNodeAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Adding node: " + newNode.data);

            head = newNode;
        } else {
            System.out.println("Adding node: " + newNode.data);
            newNode.next = head;
            head = newNode;
        }
    }

    void insertNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Adding node: " + newNode.data);
            head = newNode;
        } else {
            System.out.println("Adding node: " + newNode.data);
            Node currNode = head.next;
            Node node2ndLast = head;
            while (currNode != null) {
                currNode = currNode.next;
                node2ndLast = node2ndLast.next;
            }
            node2ndLast.next = newNode;
        }
    }

    void insertNodeAtPosition(int data, int pos){
    Node newNode = new Node(data);
    if(pos<0){
    System.out.println("Invalid position to insert ");
    }
    else{
    if(pos==0){
    insertNodeAtFirst(data);
    }
    else if(pos==getSize()){
    insertNodeAtLast(data);
    }
    else if (pos>getSize()){
    System.out.println("List has "+getSize()+" nodes, position should not exceed
    "+getSize());
    
    }
    else{
    Node currNode = head;
    int i = 1;
    while(i<pos){
    i++;
    currNode=currNode.next;
    }
    //System.out.println("currNode: "+currNode.data);
    //currNode.next=currNode.next.next;
    newNode.next=currNode.next;
    currNode.next=newNode;
    }
    }
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("The list is empty, can't delete anything");
        } else {
            if (head.next == null) {
                System.out.println("Deleting the only node " + head.data);
                head = null;
            } else {
                head = head.next;
            }
        }
    }

    void deleteAtLast() {
        if (head == null) {
            System.out.println("The list is empty, can't delete anything");
        } else {
            if (head.next == null) {
                System.out.println("Deleting the only node " + head.data);
                head = null;
            } else {
                Node currNode = head.next.next;
                Node node2ndLast = head;
                while (currNode != null) {

                    currNode = currNode.next;
                    node2ndLast = node2ndLast.next;
                }
                System.out.println("Deleting the node " + node2ndLast.next.data);
                node2ndLast.next = null;
            }
        }
    }

    void deleteAtPosition(int pos){
    if(pos<0){
    System.out.println("Invalid position to delete ");
    }
    else{
    if(pos==0){
    deleteAtFirst();
    }
    else if(pos==getSize()-1){
    deleteAtLast();
    }
    else if (pos>=getSize()){
    System.out.println("List has "+getSize()+" nodes, position should not exceed
    "+getSize());
    }
    else{
    Node currNode = head;
    int i = 1;
    while(i<pos){
    i++;
    currNode=currNode.next;
    }
    //System.out.println("currNode: "+currNode.data);
    currNode.next=currNode.next.next;
    }
    }
    }

    void showElements() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node currNode = head;
            while (currNode != null) {

                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.print(currNode + "\n");
        }
    }

    int getSize() {
        Node currNode = head;
        int size = 0;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("We are going to create our linked list...");
        LinkedList myList = new LinkedList();
        myList.insertNodeAtPosition(10, 2);
        myList.deleteAtFirst();
        myList.insertNodeAtFirst(5);
        myList.showElements();
        myList.deleteAtFirst();
        myList.showElements();
        myList.insertNodeAtFirst(4);
        myList.showElements();
        myList.insertNodeAtFirst(3);
        myList.showElements();
        myList.insertNodeAtFirst(2);
        myList.showElements();
        myList.insertNodeAtFirst(1);
        myList.showElements();
        myList.insertNodeAtPosition(10, 12);

        myList.insertNodeAtLast(6);
        myList.showElements();
        myList.insertNodeAtLast(7);
        myList.showElements();
        myList.insertNodeAtLast(8);
        myList.showElements();
        myList.insertNodeAtLast(9);
        myList.showElements();
        myList.insertNodeAtPosition(10, 9);
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());
        myList.deleteAtFirst();
        myList.showElements();
        myList.deleteAtFirst();
        myList.showElements();
        myList.deleteAtLast();
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());
        myList.deleteAtPosition(3);
        myList.showElements();
        myList.deleteAtPosition(1);
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());
        myList.insertNodeAtPosition(100, 1);
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());
        myList.insertNodeAtPosition(200, 1);
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());

        myList.insertNodeAtPosition(200, 5);
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());
        myList.insertNodeAtPosition(1000, 6);
        myList.showElements();
        System.out.println("Total number of nodes in the list is " + myList.getSize());
    }
}
