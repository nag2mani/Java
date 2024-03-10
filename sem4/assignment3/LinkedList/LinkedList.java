package LinkedList;


public class LinkedList {

    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNodeAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Added node: " + newNode.data);

            head = newNode;
        } else {
            System.out.println("Added node: " + newNode.data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Added node: " + newNode.data);
            head = newNode;
        } else {
            System.out.println("Added node: " + newNode.data);
            Node currNode = head.next;
            Node node2ndLast = head;
            while (currNode != null) {
                currNode = currNode.next;
                node2ndLast = node2ndLast.next;
            }
            node2ndLast.next = newNode;
        }
    }

    public void insertNodeAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 0) {
            System.out.println("Invalid position to insert ");
        } else {
            if (pos == 0) {
                insertNodeAtFirst(data);
            } else if (pos == getSize()) {
                insertNodeAtLast(data);
            } else if (pos > getSize()) {
                System.out.println("List has" + getSize() + "nodes, position should not exceed" + getSize());

            } else {
                Node currNode = head;
                int i = 1;
                while (i < pos) {
                    i++;
                    currNode = currNode.next;
                }
                // System.out.println("currNode: "+currNode.data);
                // currNode.next=currNode.next.next;
                newNode.next = currNode.next;
                currNode.next = newNode;
            }
        }
    }

    public void deleteAtFirst() {
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

    public void deleteAtLast() {
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

    public void deleteAtPosition(int pos) {
        if (pos < 0) {
            System.out.println("Invalid position to delete ");
        } else {
            if (pos == 0) {
                deleteAtFirst();
            } else if (pos == getSize() - 1) {
                deleteAtLast();
            } else if (pos >= getSize()) {
                System.out.println("List has " + getSize() + " nodes, position should not exceed" + getSize());
            } else {
                Node currNode = head;
                int i = 1;
                while (i < pos) {
                    i++;
                    currNode = currNode.next;
                }
                // System.out.println("currNode: "+currNode.data);
                currNode.next = currNode.next.next;
            }
        }
    }

    public void showElements() {
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

    public int getSize() {
        Node currNode = head;
        int size = 0;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }
}





