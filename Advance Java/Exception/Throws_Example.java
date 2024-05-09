public class Throws_Example {
    // defining a method
    public int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    // main method
    public static void main(String[] args) {
        Throws_Example obj = new Throws_Example();
        try {
            System.out.println(obj.divideNum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0");
        }
        System.out.println("Rest of the code..");
    }
}
