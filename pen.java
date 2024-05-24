import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class pen {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ASCII code:");
        int input = scanner.nextInt();
        char ASCII = (char)(input);
        System.out.println("Your ASCII "+input+" is "+ASCII);

    }
}
