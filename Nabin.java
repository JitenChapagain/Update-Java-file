import java.util.Scanner;

public class Nabin
{
    public static void main (String args[])
    {
        int sum,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer between 0 and 1000");
        int m =sc.nextInt();
        sum=0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);


    }
}
