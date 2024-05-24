import java.util.Scanner;

public class Grade
{
    public static void main (String args[])
    {
        int num;
        System.out.println("Ennter the number:");
        Scanner sc= new Scanner(System.in);
        num =sc.nextInt();

        if (num<=39)
        {
            System.out.println("Your grade is: F");
        }
        else if (num>=40 & num<=49)
        {
            System.out.println("Your grade is : D");
        }
        else if (num>=50 & num<=59)
        {
            System.out.println("Your grade is : C");
        }
        else if (num>=60 & num<=69)
        {
            System.out.println("Your grade is : B");
        }
        else
        {
            System.out.println("Your grade is : A");
        }
    }
}
