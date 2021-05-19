/**
 * -------------------------------------------------
 * File name: Home.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.addmonsters;

import cs2.projects.project4.ui.menu.commands.MenuCommand;

public class Home implements MenuCommand {
    private final String COMMAND_NAME = "Home";
    @Override
    public void execute() {
        System.out.println("Home");
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
