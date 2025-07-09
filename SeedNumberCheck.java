import java.util.Scanner;

public class SeedNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number (X): ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number (Y): ");
        int y = scanner.nextInt();

        int originalX = x;
        int digitProduct = 1;

        // Calculate the product of the digits of x
        while (x > 0) {
            int digit = x % 10;
            digitProduct *= digit;
            x /= 10;
        }

        int seedResult = originalX * digitProduct;

        // Check if x is a seed of y
        if (seedResult == y) {
            System.out.println(originalX + " is a seed of " + y + ".");
        } else {
            System.out.println(originalX + " is NOT a seed of " + y + ".");
        }

        scanner.close();
    }
}
