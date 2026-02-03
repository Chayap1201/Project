// Parent class
class Bank {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends Bank {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added. New Balance: " + balance);
    }
}


class CurrentAccount extends Bank {
    double charges;

    CurrentAccount(double balance, double charges) {
        super(balance);
        this.charges = charges;
    }

    void deductCharges() {
        balance -= charges;
        System.out.println("Charges deducted. New Balance: " + balance);
    }
}


public class Bank0 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5000, 5);
        CurrentAccount ca = new CurrentAccount(10000, 200);

        sa.displayBalance();
        sa.addInterest();

        System.out.println();

        ca.displayBalance();
        ca.deductCharges();
    }
}
