import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine();
    }
}
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
        }
    void sing(){
        System.out.println("I am singing");
    }
    }

