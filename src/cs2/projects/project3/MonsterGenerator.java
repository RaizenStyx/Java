/**
 * -------------------------------------------------
 * File name: MonsterGenerator.java
 * Project name: Random Encounters
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course and section: CISP 1020
 * Creation date: Apr 12, 2021
 * -------------------------------------------------
 */
package cs2.projects.project3;

import cs2.projects.project3.monsters.*;

import java.util.Random;

/**
 * <b>
 * Purpose: MonsterGenerator provided static methods for creating Monster objects
 * - Public methods: getRandomMonster
 * </b>
 * <hr>
 * Date created: Apr 12, 2021
 * <hr>
 * @author Connor Reed & Isaac Cooper
 */
public class MonsterGenerator {
    private MonsterGenerator(){

    }

    /**
     * Method description: Returns a random extended Monster object.
     * Extended Monsters currently supported:
     * -Orc
     * -Troll
     * -Banshee
     * -Dragon
     * -Druid
     * -Reaper
     * -Zombie
     * -Golem
     * -Sprite
     * -HighwayMan
     * Parameters: None
     * Return type: Monster
     */
    public static Monster getRandomMonster() {
        //total type of extended Monsters supported by getRandomMonster
        final int NUM_MONSTER_TYPES = 10;

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
                m = new Orc();
                break;
            //monster_pick = 1, then construct a Troll
            case 1:
                m = new Troll();
                break;
            //monster_pick = 2, then construct a Banshee
            case 2:
                m = new Banshee();
                break;
            //monster_pick = 3, then construct a Dragon
            case 3:
                m = new Dragon();
                break;
            //monster_pick = 4, then construct a Zombie
            case 4:
                m = new Zombie();
                break;
            //monster_pick = 5, then construct a Druid
            case 5:
                m = new Druid();
                break;
            //monster_pick = 6, then construct a Reaper
            case 6:
                m = new Reaper();
                break;
            //monster_pick = 7, then construct a Golem
            case 7:
                m = new Golem();
                break;
            //monster_pick = 8, then construct a Sprite
            case 8:
                m = new Sprite();
                break;
            //monster_pick = 9, then construct a HighwayMan
            case 9:
                m = new HighwayMan();
                break;
        }

        //Return the randomly decided monster reference
        return m;
    }
}
