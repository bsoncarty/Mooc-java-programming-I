
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        UserInterface intface = new UserInterface(new GradeRegister(), new Scanner(System.in));
        intface.start();

    }

}
