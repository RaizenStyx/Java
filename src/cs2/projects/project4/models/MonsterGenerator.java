/**
 * -------------------------------------------------
 * File name: MonsterGenerator.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course and section: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */
package cs2.projects.project4.models;

import java.util.Random;

public class MonsterGenerator {
    public static Monster getRandomMonster() {
        //total type of extended Monsters supported by getRandomMonster
        final int NUM_MONSTER_TYPES = 5;

        //A monster reference to hold our extended Monster
        Monster m = null;

        //Using the Random class to pick a random number
        Random r = new Random();

        //Generate a number 0 to NUM_MONSTER_TYPES exclusive
        int monster_pick = r.nextInt(NUM_MONSTER_TYPES);

        //Switch on monster_pick and return a newly created reference to an extended Monster type
        switch (monster_pick) {
            //monster_pick = 0, then construct an Orc
            case 0:
                m = new Orc(); //upcasting
                break;
            //monster_pick = 1, then construct a Troll
            case 1:
                m = new Troll(); //upcasting
                break;
            //monster_pick = 2, then construct a Dragon
            case 2:
                m = new Dragon(); //upcasting
                break;
            //monster_pick = 3, then construct a Banshee
            case 3:
                m = new Banshee(); //upcasting
                break;
            //monster_pick = 4, then construct a Zombie
            case 4:
                m = new Zombie(); //upcasting
                break;

        }

        //Return the randomly decided monster reference
        return m;
    }
}
