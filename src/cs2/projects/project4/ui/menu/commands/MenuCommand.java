/**
 * -------------------------------------------------
 * File name: MenuCommand.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands;

public interface MenuCommand {
    void execute();
    boolean isExit();
    String getCommandName();
}

