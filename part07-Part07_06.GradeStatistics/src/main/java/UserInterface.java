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

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            register.add(input);
        }

        if (register.average() != -1) {
            System.out.println("Point average (all): " + register.average());
        } else {
            System.out.println("Point average (all):-");
        }
        
        if (register.averageGradesAboveGrades(50) != -1){
            System.out.println("Point average (passing): " + register.averageGradesAboveGrades(50));
        }else{
            System.out.println("Point average (passing):-");
        }
        
        System.out.println("Pass percentage: " + register.percentageAboveGrade(50));
        
        System.out.println("Grade distribution: ");
        StarPrinter printer = new StarPrinter();
        printer.printer(register.convertGradeScaleToPointScale());
        
    }
}


