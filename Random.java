public class Random
{
    public static void main(String[] args)
    {
        double randomno, sum = 0.0;

        for (int i = 0; i < 5; i++) {
            randomno = Math.random();
            sum = sum + randomno;

            System.out.println(randomno + "");
        }
        System.out.println("average=" + sum / 5);
    }

}
