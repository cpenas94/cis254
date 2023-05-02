/**
 * Description: Bank Account program that allows the user to deposit
 * and withdraw which also shows the balance and the statement.
 * @author Henry Penas
 * @since 04/27/2023
 */

import java.util.Scanner;

public class Application {
	
	/**
	 * The main method that runs the Bank Account program
	 * BankAccount object allows the user to interact with the program
	 */
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
            	System.out.println("Welcome to the College of San Mateo Credit Union!");
                System.out.println("Please choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Print Statement");
                System.out.println("4. Exit");

                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Error: invalid input");
                    scanner.nextLine();
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        double depositAmount;
                        try {
                            depositAmount = scanner.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Error: invalid input");
                            scanner.nextLine();
                            continue;
                        }
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        double withdrawalAmount;
                        try {
                            withdrawalAmount = scanner.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Error: invalid input");
                            scanner.nextLine();
                            continue;
                        }
                        account.withdraw(withdrawalAmount);
                        break;
                    case 3:
                        account.printStatement();
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Error: invalid choice");
                        break;
                }
            }
        }
    }
}
