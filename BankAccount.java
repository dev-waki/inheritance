class BankAccount {
    int acNo;
    String acName, acPhone, acEmail;
    double AcBalance;

    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBalance) {
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.AcBalance = AcBalance;
    }

    public void accountholder() {
        System.out.println("Account number: " + acNo);
        System.out.println("Account holder name: " + acName);
        System.out.println("Account holder address: " + acPhone);
        System.out.println("Account holder phone: " + acEmail);
        System.out.println("Account holder balance: " + AcBalance);
    }

    public void deposit(double amount) {
        AcBalance += amount;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBalance) {
        super(acNo, acName, acPhone, acEmail, AcBalance);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBalance) {
        super(acNo, acName, acPhone, acEmail, AcBalance);
    }



    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount(1001, "Savings Account", "07200000", "test@gmail.com", 0.0);

        // Create a current account
        CurrentAccount currentAccount = new CurrentAccount(1002, "Current Account", "08100000", "admin@gmail.com", 0.0);

        // Deposit 300 into each account
        savingsAccount.deposit(300);
        currentAccount.deposit(300);

        // Output account holder information and balances for both accounts
        System.out.println("Savings Account Information:");
        savingsAccount.accountholder();
        System.out.println("Savings Account Balance: " + savingsAccount.AcBalance);

        System.out.println("\nCurrent Account Information:");
        currentAccount.accountholder();
        System.out.println("Current Account Balance: " + currentAccount.AcBalance);
    
    }
}