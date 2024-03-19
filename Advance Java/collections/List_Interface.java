//List Interfaces
import java.util.*;

public class List_Interface {
    public static void main(String[] args) {

        //ArrayList but we can access it using List.
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(-8);
        list1.add(15);
        list1.add(10);

        Iterator<Integer> itr = list1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        //LinkedList.
        List<String> list2 = new LinkedList<>();

        list2.add("Nagmani");
        list2.add("Nag");
        list2.add("mani");
        list2.add("Nagin");

        Iterator<String> itr2 = list2.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


        //Vector
        List<String> list3 = new Vector<>();

        list3.add("Nagmani1");
        list3.add("Nag1");
        list3.add("mani1");
        list3.add("Nagin1");

        Iterator<String> itr3 = list3.iterator();

        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }


        //Stack
        Stack<String> stack = new Stack<>();

        stack.push("Ayush"); 
        stack.push("Garvit"); 
        stack.push("Amit"); 
        stack.push("Ashish"); 
        stack.push("Garima"); 
        stack.pop();
        System.out.println("popped"+stack.pop());

        Iterator<String> stk = stack.iterator();

        while (stk.hasNext()) {
            System.out.println(stk.next());
        }
    }
}
