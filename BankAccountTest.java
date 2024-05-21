class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 1000.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal amount exceeds the limit of $" + WITHDRAWAL_LIMIT);
        } else {
            super.withdraw(amount);
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_FEE = 35.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

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

public class BankAccountTest {
    public static void main(String[] args) {
   
        BankAccount savings = new SavingsAccount(1500.0);
        BankAccount checking = new CheckingAccount(1500.0);

        System.out.println("\nSavings Account:");
        savings.deposit(500.0);

        savings.withdraw(2000.0); 
        savings.withdraw(500.0);  

        System.out.println("\nChecking Account:");
        checking.deposit(500.0);

        checking.withdraw(2000.0); 
        checking.withdraw(500.0);  
    }
}
