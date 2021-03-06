/**
 * -------------------------------------------------
 * File name: AddTrolls.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.addmonsters;

import cs2.projects.project4.models.Encounter;
import cs2.projects.project4.models.Troll;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddTrolls implements MenuCommand {
    private final String COMMAND_NAME = "Add Trolls";
    private Encounter encounter;

    public AddTrolls(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numTrollsToGenerate = 0;

        System.out.print("Number of Trolls to generate: ");
        numTrollsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numTrollsToGenerate; i++) {
            encounter.addMonster(new Troll());
        }

        System.out.println("Added " +  numTrollsToGenerate + " Trolls.");
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
