/**
 * -------------------------------------------------
 * File name: HighwayMan.java
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
 * Purpose: HighwayMan extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class HighwayMan extends Monster {
    private static int numHWM = 1;
    private static final int HWM_MAX_HP = 55;

    /**
     * Method description: No argument constructor, creates a name using using string literal "HighwayMan " and appends the numHWM
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and HWM_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numHWM to count
     * total number of HighwayMen created.
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public HighwayMan() {
        super("HighwayMan " + numHWM, SimpleDiceRoller.roll(HWM_MAX_HP));
        numHWM += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and HWM_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numHWM to count total number of HighwayMen created
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public HighwayMan(String name) {
        super(name, SimpleDiceRoller.roll(HWM_MAX_HP));
        numHWM += 1;
    }

    public HighwayMan(String name, int hitPoints){
        super(name, hitPoints);
        numHWM ++;
    }

    /**
     * Method description: Build a string that represents a HighwayMan
     * Date: Apr 12, 2021
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HighwayMan{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append('}');
        return sb.toString();
    }
}
