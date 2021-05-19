/**
 * -------------------------------------------------
 * File name: Banshee.java
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

public class Banshee extends Monster implements Serializable {
    private static int numBans = 1;
    private static final int BAN_MAX_HP = 58;
    private static final int BAN_ATTACK_DAMAGE = 34;
    private static final int BAN_ARMOR_CLASS = 6;

    public Banshee() {
        super("Banshee " + numBans, SimpleDiceRoller.roll(BAN_MAX_HP), BAN_ATTACK_DAMAGE, BAN_ARMOR_CLASS);
        numBans += 1;
    }

    @Override
    public String toString() {
        return "Banshee{} " + super.toString();
    }
}
