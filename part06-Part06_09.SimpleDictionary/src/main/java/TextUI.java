/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String line = scanner.nextLine();
            if (line.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (line.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);

            } else if (line.equals("search")) {
                System.out.println("To be translated:");
                String translate = scanner.nextLine();
                if (this.dictionary.translate(translate) != null) {
                    System.out.println(this.dictionary.translate(translate));
                }
                System.out.println("Word " + translate + " was not found");
            }else{
                System.out.println("Unknown command");
            }

        }
    }

}
