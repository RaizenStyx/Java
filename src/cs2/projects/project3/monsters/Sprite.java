/**
 * -------------------------------------------------
 * File name: Sprite.java
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
 * Purpose: Sprite extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class Sprite extends Monster {
    private static int numSprite = 1;
    private static final int SPT_MAX_HP = 4;

    /**
     * Method description: No argument constructor, creates a name using using string literal "Sprite " and appends the numSprite
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and SPT_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numSprites to count
     * total number of Sprites created.
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Sprite() {
        super("Sprite " + numSprite, SimpleDiceRoller.roll(SPT_MAX_HP));
        numSprite += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and SPT_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numSprites to count total number of Sprites created
     * Date: Apr 12, 2021
     * Parameters: String name
     * Return type: NA
     */
    public Sprite(String name) {
        super(name, SimpleDiceRoller.roll(SPT_MAX_HP));
        numSprite += 1;
    }

    public Sprite(String name, int hitPoints){
        super(name, hitPoints);
        numSprite++;
    }

    /**
     * Method description: Build a string that represents a Sprite
     * Date: Apr 12, 2021
     * Parameters: none
     * Return type: String
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sprite{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append('}');
        return sb.toString();
    }
}