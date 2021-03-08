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

public class GradeRegister {
    private ArrayList<Integer> grades;
    
    public GradeRegister(){
        this.grades = new ArrayList<>();
        
    }
    
    public void add(int grade){
        if (grade >= 0 && grade <= 100){
            grades.add(grade);
        }
    }
    
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    
    public int getSize(){
        return this.getSizeAboveGrade(0);
    }
    
    public int getSum(){
        return this.sumAboveGrade(0);
    }
    
    public double average(){
        return (double)this.getSum() / this.getSize();
    }
    
    public int sumAboveGrade(int grade){
        int sum = 0;
        for (int i = 0; i < this.grades.size(); i++){
            if (this.grades.get(i) >= grade){
                sum += this.grades.get(i);
            }
        }
        return sum;
    }
    
    public int getSizeAboveGrade(int grade){
        int size = 0;
        for(int i = 0; i < this.grades.size(); i++){
            if (this.grades.get(i) >= grade){
                size++;
            }
        }
        return size;
    }
    
    public double averageGradesAboveGrades(int grade){
        if (this.getSizeAboveGrade(grade) > 0){
            return (double) this.sumAboveGrade(grade) / this.getSizeAboveGrade(grade);
        }
        return -1;
        
    }
    
    public double percentageAboveGrade(int grade){
        if (this.getSizeAboveGrade(grade) > 0){
            return 100.0 * this.getSizeAboveGrade(grade) / this.getSize();
        }
        return -1;
    }
    
    public int[] convertGradeScaleToPointScale(){
        int[] register = {0, 0, 0, 0, 0, 0};
        for (int grade:grades){
            if (grade < 50){
                register[0]++;
            }else if (grade < 60){
                register[1]++;
            }else if (grade < 70){
                register[2]++;
            }else if (grade < 80){
                register[3]++;
            }else if (grade < 90){
                register[4]++;
            }else{
                register[5]++;
            }
        }
        return register;
    }

}
