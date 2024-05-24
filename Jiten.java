 /*class Account {

    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public Account(String accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

     public void withdrawal(double withdrawalamount) {

     }
 }

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(String.valueOf(accountNumber), balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Account account = new Account("123456789", 1000.0, 0.05);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Account balance: " + account.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount("987654321", 2000.0, 0.05, 500.0);
        checkingAccount.withdraw(2500.0);
        System.out.println("Checking Account balance: " + checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("555555555", 3000.0, 0.03);
        savingsAccount.withdraw(3500.0);
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());
    }
}*/