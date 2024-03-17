//List Interfaces
import java.util.*;


public class Queue_Interface {
    public static void main(String[] args) {
        
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("Nagmani");
        queue.add("JaiShankar");
        queue.add("AaiShankar");
        queue.add("Raj");

        //Both return head.
        // System.out.println(queue.element());
        // System.out.println(queue.peek());

        // for (String ele : queue) {
        //     System.out.println(ele);
        // }

        Iterator<String> itr = queue.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //remove last element
        queue.remove();
        //remove last element
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();

        while(itr2.hasNext()){ 
            System.out.println(itr2.next()); 
        }


        //Deque class(It is faster than Arraylist and stack).
        Deque<String> deque = new ArrayDeque<String>();

        deque.add("Gautam");  
        deque.add("Karan"); 
        deque.add("fffffaran"); 
        deque.add("graran"); 
        deque.add("Ajay");

        //Traversing elements  
        for (String str : deque) {  
        System.out.println(str);  
        }  

     }

}
