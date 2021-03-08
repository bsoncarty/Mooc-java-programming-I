
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String index = scanner.nextLine();
            String[] first = index.split(" ");

            if (index.equals("")) {
                break;
            }

            if (!(index.equals(""))) {
                System.out.println(first[0]);
            }

        }
    }
}
