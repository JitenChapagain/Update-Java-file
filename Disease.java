import java.util.Scanner;

public class Disease
{
    public static void main(String arg[])
    {
        int num;
        float height, mass_index, weight, mheight, kweight;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Gender:\n"+"1.Male\n"+"2.Female\n");
        System.out.println("option:");
        num = sc.nextInt();
        System.out.println("Enter your weight (pound):");
        weight = sc.nextFloat();
        System.out.println("Enter your height (inches):");
        height = sc.nextFloat();

        mheight = height / 39.37f;
        kweight = weight / 2.20f;

        mass_index = kweight / (mheight*mheight);

        if (num==1)
        {
            if (mass_index<27.8)
            {
                System.out.println("Your mass index is normal :"+mass_index);
            }
            else
            {
                System.out.println("Your mass index is high :"+mass_index);
            }
        }
        else if (num==2)
        {
            if(mass_index<27.3)
            {
                System.out.println("Your mass index is normal  :"+mass_index);
            }
            else
            {
                System.out.println("Your mass index is high  :"+mass_index);
            }
        }
    }
}
