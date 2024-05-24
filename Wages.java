import java.util.Scanner;

public class Wages {
    public static void main (String args [])
    {
        float taxa;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter wages:");
      float wage=scanner.nextFloat();

      if (wage<=57600)
      {
          taxa = (float)(0.124*wage);
          System.out.println("Your social security tax:"+taxa);
      }
      else
        {
            taxa = (float)(0.124*57600);
            System.out.println("Your social security tax:"+taxa);
        }

    }
}
