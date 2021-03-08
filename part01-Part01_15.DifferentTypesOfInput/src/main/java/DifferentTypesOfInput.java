
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String name = scan.nextLine();
       
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double number2 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean words = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + number2);
        System.out.println("You gave the boolean " + words);

    }
}
