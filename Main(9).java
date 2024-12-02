import java.util.Scanner;


public class Main {
    // method to compute the sum of the digits in an integer
    public static int sumDigits(long n) {
        int sum = 0;

        // loop to extract and add digits
        while (n != 0) {
            sum += n % 10; // extract the last digit and add to sum
            n /= 10;       // remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        // compute the sum of the digits
        int result = sumDigits(number);
        System.out.println("The sum of the digits in " + number + " is " + result);
    }
}