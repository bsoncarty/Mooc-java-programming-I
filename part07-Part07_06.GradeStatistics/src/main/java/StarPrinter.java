/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */

public class StarPrinter {
    
    public StarPrinter(){
        
    }
    
    public void printer(int[] points){
        for (int i = points.length -1; i >=0; i--){
            String stars = "";
            int count = points[i];
            for (int j = count; j >0; j--){
                stars += "*";
            }
            System.out.println(i + ": " + stars);
        }
    }
    
}

