/**
 * -------------------------------------------------
 * File name: EncounterGen.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui;

import cs2.projects.project4.models.Encounter;
import cs2.projects.project4.ui.menu.ConsoleMenu;
import cs2.projects.project4.ui.menu.commands.mainmenu.*;

public class EncounterGen {
    public static void main(String[] args) {
        final String MENU_NAME = "MONSTER LAB! Encounter Manager\n" +
                                 "------------------------------";

        Encounter encounter = new Encounter();

        ConsoleMenu menu = new ConsoleMenu(MENU_NAME);

        menu.addCommand(new AddMonsters(encounter));
        menu.addCommand(new ShowAllMonsters(encounter));
        menu.addCommand(new SaveEncounterToFile(encounter));
        menu.addCommand(new LoadEncounterFromFile(encounter));
        menu.addCommand(new SortMonsters(encounter));
        menu.addCommand(new Exit()); 

        menu.show();
    }
}
