import java.util.Scanner;

public class First {
    public static void main (String args [])
    {
        System.out.println("Hello world");
        System.out.println("finding the sum of two number:");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int sum=a+b;

        System.out.println("Thse sum of the two number is:"+sum);
    }
}
