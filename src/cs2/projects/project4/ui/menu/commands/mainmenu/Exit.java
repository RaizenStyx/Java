/**
 * -------------------------------------------------
 * File name: Exit.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.mainmenu;

import cs2.projects.project4.ui.menu.commands.MenuCommand;

public class Exit implements MenuCommand {
    private final String COMMAND_NAME = "Exit";
    @Override
    public void execute() {
        System.out.println("Exiting");
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
