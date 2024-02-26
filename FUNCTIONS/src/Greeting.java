import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
}
