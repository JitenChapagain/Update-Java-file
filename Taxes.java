import java.util.Scanner;
public class Taxes
{
    public static void main(String[] args)
    {
        Scanner im =new Scanner(System.in);
        System.out.println("Are you self-employed: YES-[1] , NO-[0]");
        int em = im.nextInt();
        System.out.println("Your annual earning::");
        float earning = im.nextFloat();

        if(em==1)
        {
            if(earning<=67500)
            {
                float FICA = (float) (earning * 0.153);
                float total = earning+FICA;
                System.out.println("Your total security tax:"+total);
            }
            else {
                float FICA =(float) (67500* 0.153);
                System.out.println("Your FICA tax is $"+FICA);
                float medi = (float) ((earning-67500)*0.029);
                System.out.println("Your medicare tax is $ "+medi);
                float total = FICA+medi;
                System.out.println("Your total security tax::"+total);

            }
        }
        else{
            if(earning<=67500)
            {
                float FICA = (float) (earning * 0.0765);
                float total = earning+FICA;
                System.out.println("Your total security tax:"+total);
            }
            else {
                float FICA =(float) (67500* 0.0765);
                float medi = (float) ((earning-67500)*0.0145);
                double total = FICA+medi;
                System.out.println("Your total security tax::"+total);

            }
        }

    }
}


