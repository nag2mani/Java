class GenericsClassTest<T>{
    
    T obj;

    void add(T obj){
        this.obj=obj;
    }

    T get(){
        return obj;
    }

}


class GenericsClass{
    public static void main(String args[]){

    GenericsClassTest<Integer> m=new GenericsClassTest<Integer>();

    m.add(2);
    m.add(4);
    //m.add("vivek");//Compile time error

    System.out.println(m.get());

    }
}

