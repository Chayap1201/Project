public class ATM {
    private double balance; 
    private int pin;        

    
    public ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    
    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }


    public void withdraw(int enteredPin, double amount) {
        if (!validatePin(enteredPin)) {
            System.out.println("Incorrect PIN! Withdrawal denied.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal denied.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount! Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        }
    }

    
    public double getBalance(int enteredPin) {
        if (validatePin(enteredPin)) {
            return balance;
        } else {
            System.out.println("Incorrect PIN! Cannot display balance.");
            return -1;
        }
    }


    public static void main(String[] args) {
        ATM myATM = new ATM(1000, 1234);

        myATM.withdraw(1111, 100); 
        myATM.withdraw(1234, 1200); 
        myATM.withdraw(1234, 200); 

        System.out.println("Balance: $" + myATM.getBalance(1234)); 
    }
}
