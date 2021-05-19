/**
 * File Name: edu.northeaststate.cs2.labs.lab04.Item.java
 * Creator's Name: Connor Reed
 * Lab: Item
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 03/06/2021
 */

package cs2.labs.lab04;

import java.util.Objects;

/**
 * Purpose: Makes item with a defined value for name and value
 * Has a default and parameterized constructor
 *  Getter Methods: getName, getValue
 *  Setter Methods: setName, setValue
 *  Public Methods: toString, equals, hashCode
 * @return
 */

public class Item {
    private String name;
    private double value;

    /**
     * Main Constructor Method
     */
    public Item(){
        this.name = "";
        this.value = 0;
    }

    /**
     * Constructor Method with Parameters
     * @param name
     * @param value
     */
    public Item(String name, double value){
        this.name = name;
        this.value = value;
    }

    /**
     * Gets name value and returns it
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name value for Object
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets value and returns it
     * @return double value
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets value for object
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Overrides toString method to return the objects name and value
     * @return String
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    /**
     * Overrides equals method and does a if statements to check
     * if the object is the same thing or not
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        // Is this myself?
        if (this == obj){
            // then Identical
            return true;
        }
        //null check
        if (obj== null){
            return false;
        }
        //type check
        if(this.getClass() != obj.getClass()){
            return false;
        }
        //
        Item item = (Item) obj;

        return Objects.equals(this.name, item.name)
                && Objects.equals(this.value, item.value);

    }

    /**
     * Overrides hashCode method to see the reference number where the
     * object is located
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}