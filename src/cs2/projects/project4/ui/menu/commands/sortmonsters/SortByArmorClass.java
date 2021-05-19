/**
 * -------------------------------------------------
 * File name: SortByArmorClass.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.sortmonsters;

import cs2.projects.project4.models.Encounter;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

public class SortByArmorClass implements MenuCommand{
    private final String COMMAND_NAME = "Sort by Armor Class";
    private Encounter encounter;

    public SortByArmorClass (Encounter encounter){this.encounter = encounter;}

    @Override
    public void execute() {
        System.out.println("Sorting...");
        this.encounter.sortMonstersByArmorClass();
        System.out.println("Monster sorted by Armor Class");

    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }
}
