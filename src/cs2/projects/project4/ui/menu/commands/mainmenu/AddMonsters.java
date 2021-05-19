/**
 * -------------------------------------------------
 * File name: AddMonsters.java
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
import cs2.projects.project4.ui.menu.commands.addmonsters.*;

public class AddMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Add Monsters";
    private Encounter encounter;

    public AddMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);

        menu.addCommand(new AddOrcs(this.encounter));
        menu.addCommand(new AddTrolls(this.encounter));
        menu.addCommand(new AddBanshees(this.encounter));
        menu.addCommand(new AddDragons(this.encounter));
        menu.addCommand(new AddZombies(this.encounter));
        menu.addCommand(new AddRandomMonsters(this.encounter));

        menu.addCommand(new Home());

        menu.show();
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }
}
