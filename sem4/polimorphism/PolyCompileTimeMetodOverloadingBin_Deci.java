// Write a program using polymorphism to convert a number from either binary to decimal or from decimal to binary.
// this is method overloading because signature of the funtion is diffrent.
// The signature of a function in Java is the combination of its name and parameters.


public class PolyCompileTimeMetodOverloadingBin_Deci {

    // Method to convert binary to decimal
    public static int convert(String binary) {
        int decimal = 0;
        int base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    // Method to convert decimal to binary
    public static String convert(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }


    public static void main(String[] args) {
        // String x = "10101";
        int x = 20;
        System.out.println(convert(x));
    }

}
