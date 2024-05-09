public class Exception_Handling {
    public static void main(String[] args) {
        // float a = 5.4f;
        // String b = null;
        // String c = "kk";
        // try {
        // // System.out.println(a + b);
        // // System.out.println(b.length());
        // System.out.println(Integer.parseInt(c));
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // try
        // {
        // int data=50/0;
        // // if exception occurs, the remaining statement will not exceute
        // System.out.println("rest of the code");
        // System.out.println(data);
        // }
        // catch(Exception e)
        // {
        // System.out.println(e);
        // }

        try {
            int data = 50 / 0;
            // if exception occurs, the remaining statement will not exceute
            System.err.println(data);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Can't solve problem");

    }
}
