import java.util.Scanner;

public class Temperature
{
    public static void main (String args[])
    {
        System.out.println("\nChoose which you want to use(Convert):\n" +
                "1.Celsius to Fahrenheit\n"+"2.Fahrenheit to Celsius\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Select the one number:");
        int a =sc.nextInt();

        if (a==1)
        {
            float Fahrenheit, Celsius;
            System.out.println("Enter the temperature in celsius:");
            Celsius = sc.nextFloat();
            Fahrenheit = ((Celsius * 9) / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
        }
        else if (a==2)
        {
            float F,C;
            System.out.println("Enter the temperature in fahrenheit:");
            F =sc.nextFloat();
            C  = ((F-32)*5)/9;
            System.out.println("Temperature in celsius is: "+C);
            if (C>75)
            {
                System.out.println("Temperature is greater than 75 degree Celsius");
            }
            }
        else
        {
            System.out.println("Please select Either 1 Or 2:");
        }
    }
}