
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] part = input.split(" ");

            if (input.equals("")) {
                break;
            }

            if (!(input.equals(""))) {

                System.out.println(part[part.length - 1]);
            }
        }

    }
}
