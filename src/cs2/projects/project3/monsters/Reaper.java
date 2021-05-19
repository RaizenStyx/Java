/**
 * -------------------------------------------------
 * File name: Reaper.java
 * Project name: Random Encounters
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course and section: 1020
 * Creation date: Apr 12, 2020
 * -------------------------------------------------
 */
package cs2.projects.project3.monsters;

import cs2.util.*;

/**
 * <b>
 * Purpose: Reaper extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2020
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class Reaper extends Monster {
private static int numReaper = 1;
private static final int RPR_MAX_HP = 66;

/**
 * Method description: No argument constructor, creates a name using using string literal "Reaper " and appends the numReaper
 * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and RPR_MAX_HP.
 * Calls parent constructor using super(). Increments the static variable numReapers to count
 * total number of Reapers created.
 * Date: Apr 12, 2021
 * Parameters: String name
 * Return type: NA
 */
public Reaper() {
        super("Reaper " + numReaper, SimpleDiceRoller.roll(RPR_MAX_HP));
        numReaper += 1;
        }

/**
 * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
 * a number between 1 and RPR_MAX_HP. Calls parent constructor using super(). Increments
 * the static variable numReaper to count total number of Reapers created
 * Date: Apr 12, 2021
 * Parameters: String name
 * Return type: NA
 */
public Reaper(String name) {
        super(name, SimpleDiceRoller.roll(RPR_MAX_HP));
        numReaper += 1;
        }

public Reaper(String name, int hitPoints){
        super(name, hitPoints);
        numReaper ++;
        }

/**
 * Method description: Build a string that represents a Reaper
 * Date: Apr 12, 2021
 * Parameters: none
 * Return type: String
 */
        @Override
        public String toString() {
                final StringBuilder sb = new StringBuilder("Reaper{");
                sb.append("name='").append(name).append('\'');
                sb.append(", hitPoints=").append(hitPoints);
                sb.append('}');
                return sb.toString();
        }
}
