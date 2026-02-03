
class Account {
    String accountNumber;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}


class LoanAccount extends Account {
    double loanAmount;

    LoanAccount(String accountNumber, double loanAmount) {
        super(accountNumber);
        this.loanAmount = loanAmount;
    }

    void displayLoan() {
        System.out.println("Loan Amount: " + loanAmount);
    }
}

public class session39 {
    public static void main(String[] args) {
        LoanAccount la = new LoanAccount("AC12345", 500000);
        la.displayAccount();   
        la.displayLoan();    
    }
}
