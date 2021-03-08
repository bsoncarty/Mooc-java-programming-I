/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class Timer {
    
    private ClockHand seconds; 
    private ClockHand hundrethsOfSeconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundrethsOfSeconds = new ClockHand(100);
    }
    
    public void advance(){
        this.hundrethsOfSeconds.advance();
        if (this.hundrethsOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds + ":" + hundrethsOfSeconds;
    }
    
}
