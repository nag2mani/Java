class formPyramid {
    formPyramid(int n) {
        int sqrt = (int) Math.sqrt(n);
        int num = 1;

        for (int i = 1; i <= sqrt; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((num++) + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= sqrt - 1; i++) {
            for (int j = 1; j <= sqrt - i; j++) {
                System.out.print((num++) + "\t");
            }
            System.out.println();
        }
    }
}



public class pattern {
    public static void main(String[] args) {
        new formPyramid(16);
    }
}
