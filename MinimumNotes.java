import java.util.Scanner;

public class MinimumNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter number of $5 notes: ");
        int x = sc.nextInt();  // Number of $5 notes

        System.out.print("Enter number of $1 notes: ");
        int y = sc.nextInt();  // Number of $1 notes

        System.out.print("Enter amount to pay: ");
        int z = sc.nextInt();  // Amount to be paid

        // Try using as many $5 notes as possible
        int fiveUsed = Math.min(z / 5, x);
        int remaining = z - fiveUsed * 5;

        // Check if we have enough $1 notes to cover the rest
        if (remaining <= y) {
            System.out.println("Use " + fiveUsed + " $5 notes and " + remaining + " $1 notes.");
        } else {
            System.out.println("-1"); // Not possible
        }

        sc.close();
    }
}
