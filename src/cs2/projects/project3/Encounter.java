/**
 * -------------------------------------------------
 * File name: Encounter.java
 * Project name: D&D Encounters
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 * Packages and Imports Modified By: Connor Reed & Isaac Cooper
 */
package cs2.projects.project3;

import cs2.projects.project3.monsters.Monster;

import java.util.ArrayList;

/**
 * <b>
 * Purpose: Encounter class is composed of a list of Monster objects and a name:
 * - Partial parameterized constructor (creates empty list of Monster objects)
 * - Public methods: addMonster
 * </b>
 * <hr>n
 * Date created: Apr 5, 2020
 * <hr>
 *
 * @author John McMeen
 */
public class Encounter {
    private ArrayList<Monster> monsters;
    private String name;

    /**
     * Method description: Partial parameterized constructor. Sets name attribute and allocates memory for ArrayList of
     * Monster objects
     * Date: Apr 5, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Encounter(String name) {
        this.name = name;
        this.monsters = new ArrayList<>();
    }

    /**
     * Method description: Adds a monster reference (shallow) to the monsters ArrayList
     * Date: Apr 5, 2020
     * Parameters: Monster monster
     * Return type: void
     */
    public void addMonster(Monster monster) {
        this.monsters.add(monster);
    }

    /**
     * Method description: Builds a string to represent Encounter
     * Date: Apr 5, 2020
     * Parameters: None
     * Return type: String
     */
    @Override
    public String toString() {
        String s = "Encounter[name= " +
                this.name +
                "]\n" +
                "monsters= \n";

        for (int i = 0; i < monsters.size(); i++) {

            s += monsters.get(i).toString() + "\n";
        }

        s += "]";

        return s;
    }

    public void sortMonstersByHitPoints() {
        this.monsters.sort(new CompareByHitPoints());
    }

    public void sortMonstersByName() {
        this.monsters.sort(new CompareByName());
    }
}
