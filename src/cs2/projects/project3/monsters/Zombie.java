/**
 * -------------------------------------------------
 * File name: Zombie.java
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
 * Purpose: Zombie extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class Zombie extends Monster {
    private static int numZombie = 1;
    private static final int ZOM_MAX_HP = 27;

    /**
     * Method description: No argument constructor, creates a name using using string literal "Zombie " and appends the numZombie
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and ZOM_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numZombies to count
     * total number of Zombies created.
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Zombie() {
        super("Zombie " + numZombie, SimpleDiceRoller.roll(ZOM_MAX_HP));
        numZombie += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and ZOM_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numZombies to count total number of Zombies created
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Zombie(String name) {
        super(name, SimpleDiceRoller.roll(ZOM_MAX_HP));
        numZombie += 1;
    }

    public Zombie(String name, int hitPoints){
        super(name, hitPoints);
        numZombie++;
    }

    /**
     * Method description: Build a string that represents an Zombie
     * Date: Apr 12, 2021
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zombie{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append('}');
        return sb.toString();
    }
}
