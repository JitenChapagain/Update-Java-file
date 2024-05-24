import java.util.Scanner;

public class Tax
{
    public static void main (String args[])
    {
        int radius;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        radius=sc.nextInt();
        System.out.println("Enter the length of the cylinder:");
        int length= sc.nextInt();

         float area = (float) (radius*radius*3.14);

        System.out.println("The area of the cylinder is:"+area);
        System.out.println("The volume of the cylinder is"+(area*length));
    }
}
