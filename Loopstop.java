import java.util.Scanner;

public class Loopstop
{
    public static void main(String[] args)
    {
        float sum,minimun,maximum,average;
        int nscore=0;
        sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score'-1 to end':");
        int num =sc.nextInt();
        minimun=num;
        maximum=num;
        while(num!=-1)
        {
            nscore++;
            sum = sum + num;
            if (maximum < num)
                maximum = num;

            if (minimun > num)
                minimun = num;
            System.out.println("Enter the test score'-1 to end':");
            num=sc.nextInt();

        }
        average=(float) (sum/nscore);
        System.out.println("the average test score is:"+average);
        System.out.println("the maximum number is:"+maximum);
        System.out.println("the minimum number is:"+minimun);



    }
}
