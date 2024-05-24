import java.util.Scanner;

class  Atm {
    float account_balance;
    int pin = 9637;


    public void checkpin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();

        if (pin == enterpin) {
            menu();
        } else
            System.out.println("Enter a valid pint:");

    }

    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3, Deposit money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkbalance();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            deposit();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice:");
        }

    }

    public void checkbalance() {
        System.out.println("Balance:" + account_balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();

        if (amt > account_balance) {
            System.out.println("Insufficient Balance");
            menu();
        } else {
            account_balance = account_balance - amt;
            System.out.println("Withdraw successfully:");
            menu();
        }
    }

    public void deposit()
    {
        System.out.println("Enter the amount to deposit:");
        Scanner sc= new Scanner(System.in);
        float dp= sc.nextFloat();

        account_balance=account_balance+dp;
        System.out.println("Deposited successfully");
        menu();
    }

}
public class ATMMachine {
    public static void main(String[] args){
        Atm obj= new Atm();
        obj.checkpin();
    }

}
