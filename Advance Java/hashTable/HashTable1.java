// public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>

// There is diffrence between hashtable(legacy) and hashmap(from java 1.2).

import java.util.*;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> obj = new Hashtable<>();
        obj.put(100, "Nagmani");
        obj.put(105, "Nag");
        obj.put(101, "mani");
        obj.put(111, "kk");

        // Iterate over the entries and print each key-value pair
        for (Map.Entry<Integer, String> itr : obj.entrySet()) {
            System.out.println("Key: " + itr.getKey() + ", Value: " + itr.getValue());
        }

        System.out.println(obj);
    }
}
