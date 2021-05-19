/**
 * -------------------------------------------------
 * File name: Dragon.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course and section: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */
package cs2.projects.project4.models;

import cs2.util.SimpleDiceRoller;

import java.io.Serializable;

public class Dragon extends Monster implements Serializable {
    private static int numDrags = 1;
    private static final int DRAG_MAX_HP = 126;
    private static final int DRAG_ATTACK_DAMAGE = 92;
    private static final int DRAG_ARMOR_CLASS = 78;

    public Dragon() {
        super("Dragon " + numDrags, SimpleDiceRoller.roll(DRAG_MAX_HP), DRAG_ATTACK_DAMAGE,
                DRAG_ARMOR_CLASS);
        numDrags += 1;
    }

    @Override
    public String toString() {
        return "Dragon{} " + super.toString();
    }
}
