import java.util.Scanner;

public class Fee
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter the age:");
        age =sc.nextInt();
        if (age<5)
        {
            System.out.println("Free");
        }
        else if(age>65)
        {
            System.out.println("$1.50");
        }
        else
        {
            System.out.println("%2.50");
        }

    }
}
