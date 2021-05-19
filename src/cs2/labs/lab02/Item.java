/**
 * File Name: edu.northeaststate.cs2.labs.edu.northeaststate.cs2.labs.lab02.Item.java
 * C reator's Name: Connor Reed
 * Lab: edu.northeaststate.cs2.labs.lab02.Item
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/15/2021
 */

package cs2.labs.lab02;

/**
 * Purpose: Makes item with a defined value for name and value
 * Has a default and parameterized constructor
 *  Getter Methods: getName, getValue
 *  Setter Methods: setName, setValue
 *  Public Methods: toString
 * @return
 */

public class Item {
    // Attributes
    private String name;
    private double value;

    /**
     * Purpose: Makes an Item with default values
     * Constructor
     * Public Method
     * Parameters: none
     * @returns: Object
     */
    public Item(){
        this.name = "";
        this.value = 0;
    }

    /**
     * Purpose: Makes an Item with parametrized values
     * Constructor
     * Public Method
     * Parameters: String, double
     * @returns: Object
     */
    public Item(String name, double value){
        this.name = name;
        this.value = value;
    }

    /**
     * Purpose: gets Name of object value 'name'
     * getter of Name value
     * Public Method
     * Parameters: none
     * @returns: String
     */
    public String getName() {
        return name;
    }

    /**
     * Purpose: sets Name of object values 'name'
     * setter of Name value
     * Public Method
     * Parameters: String
     * @returns: void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Purpose: gets Value of object values 'value'
     * getter of value value
     * Public Method
     * Parameters: none
     * @returns: double
     */
    public double getValue() {
        return value;
    }

    /**
     * Purpose: sets value of object values 'value'
     * setter of 'value' value
     * Public Method
     * Parameters: double
     * @returns: void
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Purpose: sets the values of the object into a readable
     * format when printed
     * Sets values up into a string
     * Public Method
     * Parameters: none
     * @returns: String
     */
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}