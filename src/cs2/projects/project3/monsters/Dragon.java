/**
 * -------------------------------------------------
 * File name: Dragon.java
 * Project name: Random Encounters
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course and section: 1020
 * Creation date: Apr 12, 2021
 * -------------------------------------------------
 */
package cs2.projects.project3.monsters;

import cs2.util.*;

/**
 * <b>
 * Purpose: Dragon extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class Dragon extends Monster {
    private static int numDragon = 1;
    private static final int DRA_MAX_HP = 200;

    /**
     * Method description: No argument constructor, creates a name using using string literal "Dragon " and appends the numDragons
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and DRA_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numDragons to count
     * total number of Dragons created.
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Dragon() {
        super("Dragon " + numDragon, SimpleDiceRoller.roll(DRA_MAX_HP));
        numDragon += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and DRA_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numDragons to count total number of Dragons created
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Dragon(String name) {
        super(name, SimpleDiceRoller.roll(DRA_MAX_HP));
        numDragon += 1;
    }

    public Dragon(String name, int hitPoints){
        super(name, hitPoints);
        numDragon++;
    }

    /**
     * Method description: Build a string that represents a Dragon
     * Date: Apr 12, 2021
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dragon{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append('}');
        return sb.toString();
    }
}
