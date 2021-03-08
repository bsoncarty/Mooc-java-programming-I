
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            list.add(input);
        }
        System.out.println("");
        
        double sum = 0;
        double count = 0;
        for (int i = 0; i < list.size(); i++){
            double number = list.get(i);
            sum += number;
            count = count + 1;

        }
        double average = sum / count;
        
        System.out.println("Average: " + average);
        
    }
}
