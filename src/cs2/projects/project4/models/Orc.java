/**
 * -------------------------------------------------
 * File name: Orc.java
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

public class Orc extends Monster implements Serializable {
    private static int numOrcs = 1;
    private static final int ORC_MAX_HP = 22;
    private static final int ORC_ATTACK_DAMAGE = 12;
    private static final int ORC_ARMOR_CLASS = 14;

    public Orc() {
        super("Orc " + numOrcs, SimpleDiceRoller.roll(ORC_MAX_HP), ORC_ATTACK_DAMAGE, ORC_ARMOR_CLASS);
        numOrcs += 1;
    }

    @Override
    public String toString() {
        return "Orc{} " + super.toString();
    }
}
