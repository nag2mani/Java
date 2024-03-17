import java.util.*;

public class Generics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        // list.add("10");
        System.out.println(list);


        // List list = new ArrayList();
        // list.add("hello");
        // String s = (String) list.get(0);//typecasting
        // After Generics, we don't need to typecast the object.

        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        // String s = list2.get(0);
        // System.out.println(s);
        System.out.println(list2.get(0));




    }
}
