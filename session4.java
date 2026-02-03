class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("------------------------");
    }
}

public class session4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);
        account.displayDetails();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);
        account.displayDetails();
    }
}
