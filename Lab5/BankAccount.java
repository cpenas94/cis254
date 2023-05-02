public class BankAccount {
    private int accountNumber;
    private double balance;
    private StringBuilder transactionHistory;

    private static int nextAccountNumber = 999999999;

    public BankAccount() {
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
        this.transactionHistory = new StringBuilder();
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber++;
        this.transactionHistory = new StringBuilder();
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error: cannot deposit a negative amount");
            return;
        }
        balance += amount;
        transactionHistory.append(String.format(" Deposit: $%.2f%n", amount));
    }

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

    public void printStatement() {
        System.out.printf("Account number: %d%n", accountNumber);
        System.out.printf("Balance: $%.2f%n", balance);
        System.out.println("Transaction history:");
        System.out.print(transactionHistory.toString());
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
