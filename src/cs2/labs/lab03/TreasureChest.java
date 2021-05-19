package cs2.labs.lab03;

import java.util.ArrayList;
import java.util.Random;

/**
 * File Name: edu.northeaststate.cs2.labs.edu.northeaststate.cs2.labs.Lab03.TreasureChest.java
 * Creator's Name: Connor Reed
 * Lab: edu.northeaststate.cs2.labs.lab03.TreasureChest
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/19/2021
 */

public class TreasureChest {

    private ArrayList<Item> items = new ArrayList<>();

    /**
     * Purpose: Creates a new ArrayList of items
     * Constructor
     * Public Method
     * Parameters: none
     * @returns: Object
     */
    public TreasureChest(){
        this.items = new ArrayList<>();
    }

    /**
     * Purpose: returns the items of the ArrayList
     * Public Method
     * Parameters: none
     * @return: Object
     */
    public ArrayList<Item> getItems(){
        return items;
    }

    /**
     * Purpose: Gets the number of objects in Arraylist
     * Public Method
     * Parameters: none
     * @return: int
     */
    public int getNumItems(){
        return items.size();
    }

    /**
     * Purpose: Adds up all values of the objects in the array list
     * and divides by the number of objects in arraylist
     * Public Method
     * Parameters: none
     * @return: double
     */
    public double getAvgValueOfItems(){
        double avg = 0;
        for (int i = 0; i < items.size(); i++) {
            avg += items.get(i).getValue();
        }
        return avg/getNumItems();
    }

    /**
     * Purpose: Adds a new item to Arraylist of items
     * Public Method
     * Parameters: Object
     * @returns: none
     */
    public void addItem(Item newItem) {
        items.add(newItem);
    }

    /**
     * Purpose: Gets a random object from Arraylist
     * Public method
     * Parameters: none
     * @returns: Object
     */
    public Item getRandomItem(){
        Random random = new Random();
        int choice = random.nextInt(items.size());
        return items.get(choice);
    }

        /**
         * Purpose: Returns a loop of tostring methods
         */
        @Override
        public String toString() {
            String out ="";

            for(Item i: items){
                out += i.toString() + "\n";
            }
            return out;
    }
}