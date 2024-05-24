import java.util.Scanner;

public class Largest
{
    public static void main (String args[])
    {
        int a,b;
        System.out.println("Enter the number a:");
        Scanner sc= new Scanner(System.in);
        a =sc.nextInt();
        System.out.println("Enter the number b:");
        b =sc.nextInt();

        if (a>b)
        {
            System.out.println("The largest number is:"+a);
        }
        else if (a<b)
        {
            System.out.println("The largest number is:"+b);
        }
        else
        {
            System.out.println("Both are equal:");

        }

    }
}
