
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String nameOldest = "";
        while (true){
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (input.equals("")){
                break;
            }
            if (!(input.equals(""))){
                if (Integer.valueOf(parts[1]) > oldest){
                    oldest = Integer.valueOf(parts[1]);
                    nameOldest = parts[0];
                }
            }
        }
        System.out.println(nameOldest);

    }
}
