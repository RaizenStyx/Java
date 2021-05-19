/**
 * -------------------------------------------------
 * File name: SortMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.mainmenu;

import cs2.projects.project4.models.Encounter;
import cs2.projects.project4.ui.menu.ConsoleMenu;
import cs2.projects.project4.ui.menu.commands.MenuCommand;
import cs2.projects.project4.ui.menu.commands.addmonsters.Home;
import cs2.projects.project4.ui.menu.commands.sortmonsters.*;

public class SortMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Sort Monsters";
    private Encounter encounter;

    public SortMonsters(Encounter encounter){this.encounter = encounter;}

    @Override
    public void execute() {
        ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);

        menu.addCommand(new SortByName(encounter));
        menu.addCommand(new SortByHitPoints(encounter));
        menu.addCommand(new SortByAttackDamage(encounter));
        menu.addCommand(new SortByArmorClass(encounter));

        menu.addCommand(new Home());

        menu.show();
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Sort Monsters";
    }
}
