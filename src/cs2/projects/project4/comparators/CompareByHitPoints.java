/**
 * -------------------------------------------------
 * File name: CompareByHitPoints.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */
package cs2.projects.project4.comparators;

import cs2.projects.project4.models.Monster;

import java.util.Comparator;

public class CompareByHitPoints implements Comparator<Monster> {
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getHitPoints() - m2.getHitPoints();
    }
}
