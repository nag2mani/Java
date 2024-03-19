public class WrapperClass {
    public static void main(String[] args) {

        //Autoboxing Example.
        int a = 22;
        Integer b = Integer.valueOf(a); //Explicitly converting into Integer
        Integer c = a; //autoboxing.
        System.out.println(a+ " " + b + " " + c);


        //Unboxing Example
        // Integer i = new Integer(55);
        Integer i = 56;
        int j = i.intValue(); //Explicitly converting into Integer
        int k = i; //Unboxing.
        System.out.println(i+ " " + j + " " + k);
    }
}
