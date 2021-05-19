/**
 * -------------------------------------------------
 * File name: AddDragons.java
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
import cs2.projects.project4.models.Dragon;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddDragons implements MenuCommand {
    private final String COMMAND_NAME = "Add Dragons";
    private Encounter encounter;

    public AddDragons(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numDragsToGenerate = 0;

        System.out.print("Number of Dragons to generate: ");
        numDragsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numDragsToGenerate; i++) {
            encounter.addMonster(new Dragon());
        }

        System.out.println("Added " +  numDragsToGenerate + " Dragons.");
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
