/**
 * Description: Bank Account program that allows the user to deposit
 * and withdraw which also shows the balance and transaction history
 * @author Henry Penas
 * @since 04/27/2023
 */


/**
 * This class shows a bank account with a balance and the 
 * transaction history.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private StringBuilder transactionHistory;

    private static int nextAccountNumber = 999999999;

    
    /**
     * Starts the program a balance of 0 and shows the account number
     */
    public BankAccount() {
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
        this.transactionHistory = new StringBuilder();
    }

    /**
     * Constructs a new object with a set initial balance
     * @param initialBalance the initial balance of the bank account
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber++;
        this.transactionHistory = new StringBuilder();
    }
    
    /**
     * Deposits a user inputed amount into the account
     * Cannot deposit negative amount
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error: cannot deposit a negative amount");
            return;
        }
        balance += amount;
        transactionHistory.append(String.format(" Deposit: $%.2f%n", amount));
    }
    
    /**
     * Withdraws an inputed amount from the account.
     * If the amount is a negative, it prints out an error message and no transactions
     * is made.
     * If the amount is more than the balance, error message will be displayed and 
     * no transaction will be made.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Error: cannot withdraw a negative amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: insufficient funds");
            return;
        }
        balance -= amount;
        transactionHistory.append(String.format(" Withdrawal: $%.2f%n", amount));
    }

    /**
     * Prints out the account number, the balance and the transaction history.
     */
    public void printStatement() {
        System.out.printf("Account number: %d%n", accountNumber);
        System.out.printf("Balance: $%.2f%n", balance);
        System.out.println("Transaction history:");
        System.out.print(transactionHistory.toString());
    }

    /**
     * Sets the balance of the bank account
     * @param balance the new balance in the account
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * Returns the current balance of the bank account
     * @return the current balance in the account
     */
    public double getBalance() {
        return balance;
    }
}
