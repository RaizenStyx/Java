/**
 * -------------------------------------------------
 * File name: Golem.java
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
 * Purpose: Golem extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class Golem extends Monster {
    private static int numGolem = 1;
    private static final int GOL_MAX_HP = 150;

    /**
     * Method description: No argument constructor, creates a name using using string literal "Golem " and appends the numGolem
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and GOL_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numGolems to count
     * total number of Golems created.
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Golem() {
        super("Golem " + numGolem, SimpleDiceRoller.roll(GOL_MAX_HP));
        numGolem += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and GOL_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numGolems to count total number of Golems created
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Golem(String name) {
        super(name, SimpleDiceRoller.roll(GOL_MAX_HP));
        numGolem += 1;
    }

    public Golem(String name, int hitPoints){
        super(name, hitPoints);
        numGolem++;
    }

    /**
     * Method description: Build a string that represents a Golem
     * Date: Apr 12, 2021
     * Parameters: none
     * Return type: String
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Golem{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append('}');
        return sb.toString();
    }
}
