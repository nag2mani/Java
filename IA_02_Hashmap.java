import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class IA_02_Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> d = new HashMap<>();
        d.put("soap", 20);
        d.put("oil", 100);
        d.put("soapyy", 200);
        d.put("water", 15);
        d.put("sanitiser", 50);
        // for (String i: d.keySet()){
        //     System.out.println("item :"+ i +", value :" + d.get(i));
        // }
        // ArrayList<Integer> array = new ArrayList<>();
        // for (String i: d.keySet()){
        //     int x = d.get(i);
        //     array.add(x);
        // }
        // Collections.sort(array);
        // System.out.println(array);
        // System.out.println(d);

        // for (int i; i<array.size(); i++){
        //     System.out.println("item :"+ i +", value :" + d.get(i));
        // }

        for(String i : d.keySet()){
            System.out.println(d.get(i));
            System.out.println(d.getClass().getName());
        }
    }
}
