public class BankAccount{
    private double balance; 

    
    public BankAccount(double initialBalance) {
        balance = initialBalance >= 0 ? initialBalance : 0;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(30);
        System.out.println("Balance: " + account.getBalance());
    }
}
