class NumConvertion {
    // Method of parent class
    void convert(int num) {
        System.out.println("This will convert the number " + num);
    }
}


class Binary extends NumConvertion {
    void convert(int num) {
        int binary[] = new int[40];
        int index = 0;
        System.out.print("The binary representation is: ");
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();// new line
    }
}


class Decimal extends NumConvertion {
    void convert(int num) {
        int decimal = 0;
        int n = 0;
        while (true) {

            if (num == 0) {
                break;
            } else {
                int temp = num % 10;
                decimal += temp * Math.pow(2, n);
                num = num / 10;
                n++;
            }
        }
        System.out.println("The decimal representation is: " + decimal);
    }
}


public class PolyRunTimeMetodOveridingBin_Deci {
    public static void main(String[] args) {

        NumConvertion a = new Decimal();
        a.convert(11011);

        NumConvertion b = new Binary();
        b.convert(80);
    }
}
