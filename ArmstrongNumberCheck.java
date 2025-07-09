import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int temp = number;
        int digits = 0;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = number;

        // Calculate sum of nth powers of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check for Armstrong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
