public class PlindromeLeapyear {

    public static boolean isPalindromeYear(int year) {
        int originalYear = year;
        int reversedYear = 0;

        // Reverse the digits of the year
        while (year > 0) {
            int digit = year % 10;
            reversedYear = reversedYear * 10 + digit;
            year /= 10;
        }

        // Check if the reversed year is the same as the original year
        return originalYear == reversedYear;
    }


    public static void main(String[] args) {
        int y1 = 1;
        int y2 = 2024;
        for (int i = y1 ; i <= y2 ; i++){

            if (i%100 == 0){
                if (i % 400 == 0){
                    // then it is leap year.
                    for i
                }
            }

            else{
                if (i%4==0){
                    // then it is leap year

                }
            }
        }
    }
}
