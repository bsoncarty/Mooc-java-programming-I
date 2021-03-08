/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Commands: " + "\n" +
                    "1 - add a joke " + "\n" +
                    "2 - draw a joke " + "\n" +
                    "3 - list jokes " + "\n" +
                    "X - stop ");
            String command = scanner.nextLine();
            if (command.equals("X")){
                break;
            }
            if (command.equals("1")){
                System.out.println("Write the joke to be added: ");
                String add = scanner.nextLine();
                jokes.addJoke(add);
            }else if(command.equals("2")){
                System.out.println(jokes.drawJoke());
            }else if(command.equals("3")){
                jokes.printJokes();
            }
        }
    }
}
