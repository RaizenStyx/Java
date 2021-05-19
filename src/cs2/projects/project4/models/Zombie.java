/**
 * -------------------------------------------------
 * File name: Zombie.java
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

public class Zombie extends Monster implements Serializable {
    private static int numZoms = 1;
    private static final int ZOM_MAX_HP = 30;
    private static final int ZOM_ATTACK_DAMAGE = 18;
    private static final int ZOM_ARMOR_CLASS = 8;

    public Zombie() {
        super("Zombie " + numZoms, SimpleDiceRoller.roll(ZOM_MAX_HP), ZOM_ATTACK_DAMAGE, ZOM_ARMOR_CLASS);
        numZoms += 1;
    }

    @Override
    public String toString() {
        return "Zombie{} " + super.toString();
    }
}
