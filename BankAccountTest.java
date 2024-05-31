//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. 
//Override the withdraw() method in each subclass to impose different withdrawal limits and fees.

// Base class representing a bank account
class BankAccount {
    // Protected balance variable to store the account balance
    protected double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    
    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Derived class representing a savings account
class SavingsAccount extends BankAccount {
    // Constant for the withdrawal limit
    private static final double WITHDRAWAL_LIMIT = 1000.0;

    // Constructor to initialize the balance
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override the withdraw method to add withdrawal limit logic
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal amount exceeds the limit of $" + WITHDRAWAL_LIMIT);
        } else {
            super.withdraw(amount);
        }
    }
}

// Derived class representing a checking account
class CheckingAccount extends BankAccount {
    // Constant for the overdraft fee
    private static final double OVERDRAFT_FEE = 35.0;

    // Constructor to initialize the balance
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override the withdraw method to add overdraft fee logic
    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= (amount + OVERDRAFT_FEE);
            System.out.println("Withdrew: $" + amount);
            System.out.println("Overdraft fee: $" + OVERDRAFT_FEE);
            System.out.println("New balance: $" + balance);
        } else {
            super.withdraw(amount);
        }
    }
}

// Test class with main method
public class BankAccountTest {
    public static void main(String[] args) {
        // Create a SavingsAccount object with an initial balance of 1500.0
        BankAccount savings = new SavingsAccount(1500.0);
        // Create a CheckingAccount object with an initial balance of 1500.0
        BankAccount checking = new CheckingAccount(1500.0);

        // Test SavingsAccount operations
        System.out.println("\nSavings Account:");
        savings.deposit(500.0); // Deposit 500.0 into savings

        savings.withdraw(2000.0); // Attempt to withdraw 2000.0 from savings (exceeds limit)
        savings.withdraw(500.0);  // Withdraw 500.0 from savings (within limit)

        // Test CheckingAccount operations
        System.out.println("\nChecking Account:");
        checking.deposit(500.0); // Deposit 500.0 into checking

        checking.withdraw(2000.0); // Attempt to withdraw 2000.0 from checking (overdraft)
        checking.withdraw(500.0);  // Withdraw 500.0 from checking (within balance)
    }
}
