import java.util.Scanner;
class ATM {
    private double balance;

    
    ATM(double initialBalance) {
        balance = initialBalance;
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

    
    void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

public class session8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ATM myATM = new ATM(1000.0);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nATM Operations:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    myATM.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    myATM.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    myATM.withdraw(wit);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
