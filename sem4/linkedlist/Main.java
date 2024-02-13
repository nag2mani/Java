class LinkedList{

    // This is node class for linkedlist.
    Node head;
    int size = 0;

    //Constructor same like __init__ in python.
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //add the first element in the linkedlist.
    void addFirst(int data){
        Node newNode = new Node(data);
        size = size +1 ;
        if (head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }


    //add to the last of the linkedlist.
    void addLast(int data){
        Node newNode = new Node(data);
        size = size +1;
        if(head==null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // It will show the elements of the linkedlist.
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

    //It will return the size of the linkedlist.
    int getSize(){
        return size;
    }

    // It will return the first element of the linkedlist.
    void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
        }
        else{
            head = head.next;
            size--;
        }
    }

    // It will return the last element of the linkedlist.
    void deleteLast(){
        if (head == null){
            System.out.println("list is empty");
        }
        else{
            if (head.next == null){
                head = head.next;
                
            }else{
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;
        }
    }
}


//Main class.
public class Main {
    public static void main(String[] args) {

        LinkedList mylist = new LinkedList();

        mylist.addFirst(4);
        mylist.addFirst(5);
        mylist.addFirst(6);
        mylist.addFirst(60);
        mylist.addLast(90);
        mylist.deleteFirst();
        mylist.deleteLast();
        mylist.show();
        System.out.println(mylist.getSize());

    }
    
}


