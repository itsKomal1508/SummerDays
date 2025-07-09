import java.util.Scanner;

public class LuckyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();

        int sum = 0;

        // Iterate through the digits starting from left
        for (int i = 0; i < numberStr.length(); i++) {
            // Even-positioned digits (2nd, 4th, ...)
            if ((i + 1) % 2 == 0) {
                int digit = Character.getNumericValue(numberStr.charAt(i));
                sum += digit * digit;
            }
        }

        // Check if sum is divisible by 9
        if (sum % 9 == 0) {
            System.out.println(numberStr + " is a Lucky Number.");
        } else {
            System.out.println(numberStr + " is NOT a Lucky Number.");
        }

        scanner.close();
    }
}
