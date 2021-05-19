/**
 * -------------------------------------------------
 * File name: Druid.java
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
 * Purpose: Druid extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class Druid extends Monster {
    private static int numDruid = 1;
    private static final int DRU_MAX_HP = 18;

    /**
     * Method description: No argument constructor, creates a name using using string literal "Druid " and appends the numDruid
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and DRU_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numDruids to count
     * total number of Druids created.
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Druid() {
        super("Druid " + numDruid, SimpleDiceRoller.roll(DRU_MAX_HP));
        numDruid += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and DRU_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numDruids to count total number of Druids created
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Druid(String name) {
        super(name, SimpleDiceRoller.roll(DRU_MAX_HP));
        numDruid += 1;
    }

    public Druid(String name, int hitPoints){
        super(name, hitPoints);
        numDruid ++;
    }

    /**
     * Method description: Build a string that represents a Druid
     * Date: Apr 12, 2021
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Druid{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append('}');
        return sb.toString();
    }
}
