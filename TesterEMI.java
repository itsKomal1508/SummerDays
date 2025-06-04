import java.util.*;
class TesterEmi {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc=new Scanner(System.in);
	 System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account balance: ");
        double accountBalance = sc.nextDouble();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // consume newline

        System.out.print("Enter loan type (Car/House/Business): ");
        String loanType = sc.nextLine();

        System.out.print("Enter expected loan amount: ");
        double expectedLoanAmount = sc.nextDouble();

        System.out.print("Enter expected number of EMIs: ");
        int expectedEmis = sc.nextInt();

        // Validation: account number
        if (String.valueOf(accountNumber).length() != 4 || String.valueOf(accountNumber).charAt(0) != '1') {
            System.out.println("Invalid account number. It should be 4 digits and start with 1.");
            return;
        }

        // Validation: balance
        if (accountBalance < 1000) {
            System.out.println("Insufficient account balance. Minimum $1000 required.");
            return;
        }

        // Determine eligible loan amount and EMI
        double eligibleLoanAmount = 0;
        int eligibleEmis = 0;
        boolean eligible = false;

        if (loanType.equalsIgnoreCase("Car") && salary > 25000) {
            eligibleLoanAmount = 500000;
            eligibleEmis = 36;
            eligible = true;
        } else if (loanType.equalsIgnoreCase("House") && salary > 50000) {
            eligibleLoanAmount = 6000000;
            eligibleEmis = 60;
            eligible = true;
        } else if (loanType.equalsIgnoreCase("Business") && salary > 75000) {
            eligibleLoanAmount = 7500000;
            eligibleEmis = 84;
            eligible = true;
        }

        if (!eligible) {
            System.out.println("Customer is not eligible for the requested loan type based on salary.");
        } else if (expectedLoanAmount <= eligibleLoanAmount && expectedEmis <= eligibleEmis) {
            System.out.println("eligibleLoanAmount=" + (int) eligibleLoanAmount);
            System.out.println("eligibleEmis=" + eligibleEmis);
        } else {
            System.out.println("The bank cannot provide the loan with the requested amount or EMIs.");
        }

	}
}

