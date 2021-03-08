
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println("First: 0/100");
                System.out.println("Second: 0/100");
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                first.add(value);

            }
            if (command.equals("move")) {
                if (first.contains() >= value){
                    first.remove(value);
                    second.add(value);
                }else{
                    second.add(first.contains());
                    first.remove(first.contains());
                }

            }
            if (command.equals("remove")) {
                second.remove(value);
            }
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
        }

    }
}
