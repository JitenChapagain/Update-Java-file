import java.util.Scanner;

public class Largest3
{
    public static void main (String args[])
    {
        int a,b,c;
        System.out.println("Enter the number a:");
        Scanner sc= new Scanner(System.in);
        a =sc.nextInt();
        System.out.println("Enter the number b:");
        b =sc.nextInt();
        System.out.println("Enter the number c:");
        c=sc.nextInt();

        if (a>b & a>c)
        {
            System.out.println("The largest number is:"+a);
        }
        else if (a<b & b>c)
        {
            System.out.println("The largest number is:"+b);
        }
        else
        {
            System.out.println("The largest number is:"+c);
        }

    }
}
