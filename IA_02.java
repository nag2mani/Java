import java.util.ArrayList;
import java.util.Collections;
public class IA_02 {
    public static void main(String[] args) {
        // //Simple array:
        // int[] a = {1, 3, 5, 7};
        // for(int i : a){
        //     System.out.println(i);
        // }
        
        ArrayList<Integer> cars = new ArrayList<>();
        cars.add(3);
        cars.add(55);
        cars.add(-4);
        cars.add(5);
        // System.out.println(cars.get(0));
        // System.out.println(cars.set(0, "Tata"));
        // System.out.println(cars.remove(1));
        System.out.println(cars);
        Collections.sort(cars, Collections.reverseOrder());
        ArrayList<Integer> x = cars;
        System.out.println(x);
    }
}
