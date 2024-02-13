class LinkedList{

    // This is node class for linkedlist.
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }


    void show(){
        if (head ==null){
            System.out.println("list is empty");
        }else{
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println(temp);
        }
    }
}



public class Main {
    public static void main(String[] args) {

        LinkedList mylist = new LinkedList();

        mylist.addFirst(4);
        mylist.addFirst(5);
        mylist.addFirst(6);

        mylist.show();

    }
    
}