import java.util.Scanner;

public class Investment
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        double a = sc.nextDouble();
        System.out.println("Enter the annual interest rate :");
        double b =sc.nextDouble()/100.0;

        System.out.println("Enter the number of the year :");
        double c = sc.nextDouble();
        double fi;

        fi = a * (Math.pow(1+b,c*12));

        System.out.println("The future investment is :"+fi);
    }
}
