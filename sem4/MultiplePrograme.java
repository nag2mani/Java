import java.util.Scanner;


public class MultiplePrograme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Display menu
        System.out.println("Choose an option:");
        System.out.println("1. Convert to Decimal");
        System.out.println("2. Convert to Binary");
        System.out.println("3. Check Prime");
        System.out.println("4. Check Armstrong");
        System.out.println("5. Check Leap Year");

        // Take user's choice
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                convertToDecimal(number);
                break;
            case 2:
                convertToBinary(number);
                break;
            case 3:
                checkPrime(number);
                break;
            case 4:
                checkArmstrong(number);
                break;
            case 5:
                checkLeapYear(number);
                break;
            default:
                System.out.println("Invalid choice!");
            }
    }

    private static void convertToDecimal(int number) {
        System.out.println("Decimal representation: " + number);
    }

    private static void convertToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binary);
    }

    private static void checkPrime(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void checkArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

    private static void checkLeapYear(int number) {
        if ((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0)) {
            System.out.println(number + " is a leap year.");
        } else {
            System.out.println(number + " is not a leap year.");
        }
    }
}
