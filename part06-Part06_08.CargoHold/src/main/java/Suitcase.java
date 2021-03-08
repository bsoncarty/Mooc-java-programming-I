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

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> suitcase;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addItem(Item item) {
        if ((item.getWeight() + this.totalWeight()) <= this.maximumWeight) {
            suitcase.add(item);
        }
    }

    public void printItems() {
        String items = "";
        for (Item item : this.suitcase) {
            items = items + item.toString() + "\n";
        }
        System.out.println(items);
    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Item item : this.suitcase) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    public Item heaviestItem() {
        Item heaviest = new Item("", 0);
        if (this.suitcase.isEmpty()) {
            return null;
        }
        for (Item item : this.suitcase) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public String toString() {
        if (suitcase.size() == 0) {
            return "no items (0 kg)";
        }
        if (suitcase.size() == 1) {
            return suitcase.size() + " item (" + this.totalWeight() + " kg)";
        }
        return suitcase.size() + " items (" + this.totalWeight() + " kg)";
    }
}
