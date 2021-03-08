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

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        if (room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;

    }

    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }

        Person shortest = new Person("", 1000);
        for (Person person : this.room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
            
        }
        return shortest;
    }
    
    public Person take(){
        if (this.isEmpty()){
            return null;
        }
        Person taken = this.shortest();
        this.room.remove(this.shortest());
        return taken;
    }
}
