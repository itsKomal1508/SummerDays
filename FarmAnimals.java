import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter total number of heads: ");
        int heads = scanner.nextInt();
        System.out.print("Enter total number of legs: ");
        int legs = scanner.nextInt();

        boolean found = false;

        // Try all possible number of rabbits from 0 to total heads
        for (int rabbits = 0; rabbits <= heads; rabbits++) {
            int chickens = heads - rabbits;
            int totalLegs = (chickens * 2) + (rabbits * 4);

            if (totalLegs == legs) {
                System.out.println("Number of Chickens: " + chickens);
                System.out.println("Number of Rabbits: " + rabbits);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No valid solution. The input does not match any combination of chickens and rabbits.");
        }

        scanner.close();
    }
}
