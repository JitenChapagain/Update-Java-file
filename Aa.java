import java.util.Scanner;
class Account{
    private int accountNumber;
    private double balance;
    private double annualInterestRate;

    public Account(int accountNumber, double balance, double annualInterestRate) {
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdrawal(double amount){
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("No sufficient balance! Withdraw canceled.");
    }

    @Override
    public String toString() {
        return "Account {\n " + "accountNumber=" + accountNumber + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate + "\n" + '}'
                + "\n";
    }
}
class CheckingAccount extends Account{

    Scanner scan = new Scanner(System.in);
    String accountHolderName;
    private double overdraftLimit;
    double interestRate;

    public CheckingAccount(int accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.setOverdraftLimit(overdraftLimit);
    }

    public void withdrawal(double amount){
        if(amount<=getBalance()+overdraftLimit){
            super.withdrawal(amount);
        }
        else
            System.out.println("Withdrawn cannot be completed.");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return super.toString()  + "CheckingAccount \n {" +
                "overdraftLimit=" + overdraftLimit +
                "\n"+
                '}';
    }
}
class SavingAccount extends Account{
    public SavingAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

}
public class Aa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        Account checkingAccount = null;
        Account savingAccount = null;

        do{
            System.out.println("!!!Bank Menu!!!");
            System.out.println("1. Create a Checking Accounts.");
            System.out.println("2. Create a Saving Accounts.");
            System.out.println("3. Deposit in Checking Accounts.");
            System.out.println("4. Deposit in Saving Accounts.");
            System.out.println("5. Withdraw from Checking Accounts.");
            System.out.println("6. Withdraw from Saving Accounts.");
            System.out.println("7. Show Checking Accounts Information.");
            System.out.println("8. Show Saving Accounts Information.");
            System.out.println("9. Exit the menu.");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    if(checkingAccount != null){
                        System.out.println("Account already exists!!");
                    }
                    else{
                        System.out.println("Enter new account number: ");
                        int accountNumber = scan.nextInt();
                        System.out.println("Enter your initial balance:");
                        double balance = scan.nextDouble();
                        System.out.println("Enter annual interest rate:");
                        double annualInterest = scan.nextDouble();
                        System.out.println("Enter overdraft limit:");
                        double overdraft = scan.nextDouble();

                        checkingAccount = new CheckingAccount(accountNumber,balance,annualInterest,overdraft);
                        System.out.println("Created Successfully!!!");
                    }
                    break;

                case 2:
                    if(savingAccount !=null){
                        System.out.println("Account already exists!!");
                    }
                    else{
                        System.out.println("Enter account number:");
                        int accountnumber = scan.nextInt();
                        System.out.println("Enter your initial balance:");
                        double balance = scan.nextDouble();
                        System.out.println("Enter annual interest rate::");
                        double interestRate = scan.nextDouble();

                        savingAccount = new SavingAccount(accountnumber,balance,interestRate);
                        System.out.println("Created Successfully!!!");
                    }
                    break;

                case 3:
                    if(checkingAccount == null){
                        System.out.println("Account does not exists!!!");
                    }
                    else{
                        System.out.println("Enter deposit amount:");
                        double depositAmount = scan.nextDouble();
                        checkingAccount.deposit(depositAmount);
                        System.out.println("Deposit successful!!");
                    }
                    break;

                case 4:
                    if(savingAccount ==null){
                        System.out.println("Account does not exist!!!");
                    }
                    else{
                        System.out.println("Enter deposit amount::");
                        double depositamount = scan.nextDouble();
                        savingAccount.deposit(depositamount);
                        System.out.println("Deposit successful!!");
                    }
                    break;

                case 5:
                    if(checkingAccount == null){
                        System.out.println("Account does not exists!!!");
                    }
                    else{
                        System.out.println("Enter withdrawal amount: ");
                        double withdrawal = scan.nextDouble();
                        checkingAccount.withdrawal(withdrawal);
                        System.out.println("Withdrawal Complete!!!");
                    }
                    break;

                case 6:
                    if(savingAccount == null){
                        System.out.println("Account does not exists!!!");
                    }
                    else{
                        System.out.println("Enter withdrawal amount:");
                        double withdrawalamount = scan.nextDouble();
                        savingAccount.withdrawal(withdrawalamount);
                        System.out.println("Successful!");
                    }
                    break;

                case 7:
                    if(checkingAccount == null){
                        System.out.println("Account does not exist!!!");
                    }
                    else{
                        System.out.println(checkingAccount);
                    }
                    break;

                case 8:
                    if(savingAccount == null){
                        System.out.println("Account does not exists!!!");
                    }
                    else{
                        System.out.println(savingAccount);
                    }
                    break;

                case 9:
                    System.out.println("Exiting..........");
                    break;

                default:
                    System.out.println("Invalid input !!! Try Again!!!");
            }
            System.out.println();
        }
        while(choice != 9);
    }
}