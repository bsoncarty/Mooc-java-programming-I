/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class Counter {
    
    private int startValue;
    
    public Counter(int startValue){
        this.startValue = startValue;
    }
    
    public Counter(){
        this.startValue = 0;
    }
    
    public int value(){
        return startValue;
    }
    
    public void increase(){
        startValue = startValue + 1;
    }
    
    public void decrease(){
        startValue = startValue - 1;
    }
    
    public void increase(int increaseBy){
        if(increaseBy >= 0){
            startValue = startValue + increaseBy;
        }
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            startValue = startValue - decreaseBy;
        }
    }
    
}
