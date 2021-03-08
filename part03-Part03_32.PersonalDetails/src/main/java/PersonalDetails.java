
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        int longest = 0;
        String longestName = "";
        while (true){
            String input = scanner.nextLine();
            String[] part = input.split(",");
            if (input.equals("")){
                break;
            }
            if (!(input.equals(""))){
                sum += Integer.valueOf(part[1]);
                count++;
                if (part[0].length() > longest){
                    longest = part[0].length();
                    longestName = part[0];
                    
                }
            }
        }
        double average = sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
