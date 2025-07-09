import java.util.Scanner;

public class LCMCalculator {

    // Function to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first whole number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second whole number: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("LCM is not defined for 0.");
        } else {
            int gcd = findGCD(num1, num2);
            int lcm = (num1 * num2) / gcd;
            System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);
        }

        scanner.close();
    }
}
