class Laptop{
    String name;
    Integer price;

    public String toString(){
        return "Name "+ name + " Price " + price;
    }

    public boolean equals(Laptop other){
        return (this.name==other.name) && (this.price == other.price);
    }
}


public class ObjectClass {
    public static void main(String[] args) {

        // To String method.
        Laptop lp1 = new Laptop();
        lp1.name = "Lenovo";
        lp1.price = 10000;
        System.out.println(lp1.toString());


        // Hashcode method.
        Laptop obj1 = new Laptop();
        Laptop obj2 = new Laptop();
        Laptop obj3 = new Laptop();
        Laptop obj4 = new Laptop();
        Laptop obj5 = new Laptop();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        System.out.println(obj5.hashCode());


        //Equals method.
        Laptop obj11 = new Laptop();
        obj11.name="nag";
        Laptop obj12 = new Laptop();
        obj12.name="nag1";
        Laptop obj13 = obj12;

        System.out.println(obj11.equals(obj12));

        System.out.println(obj13.equals(obj12));



        //Get class method;
        Laptop obj121= new Laptop();
        System.out.println(obj121.getClass());
    }

}
