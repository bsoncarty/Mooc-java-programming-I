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

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.hold) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((suitcase.totalWeight() + this.totalWeight()) <= this.maximumWeight) {
            hold.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase suitcase : this.hold){
            suitcase.printItems();
        }
    }

    public String toString() {
        return hold.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
