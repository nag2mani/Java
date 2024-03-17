import java.util.*;

public class Set_Interface {

    public static void main(String[] args) {
        
    //Creating HashSet and adding elements.(Contain Unique only)
    HashSet<String> set=new HashSet<String>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Ravi");  
    set.add("Ajay");

    //Traversing elements.
    Iterator<String> itr = set.iterator();

    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }


    LinkedHashSet<String> set2=new LinkedHashSet<String>();
    set2.add("Ravi");  
    set2.add("Vijay");  
    set2.add("Ravi");  
    set2.add("Ajay");
    Iterator<String> itr2 =set2.iterator(); 
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
    }


    SortedSet<String> set3 = new TreeSet<>();
    //Creating and adding elements  
    // TreeSet<String> set3=new TreeSet<String>();  
    set3.add("Ravi");  
    set3.add("Vijay");  
    set3.add("Ravi");  
    set3.add("Ajay");  
    //traversing elements  
    Iterator<String> itr3 = set3.iterator();  
    while(itr3.hasNext()){  
    System.out.println(itr3.next());  
    }

}

}
