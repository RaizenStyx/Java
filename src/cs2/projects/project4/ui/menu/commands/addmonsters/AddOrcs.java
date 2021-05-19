/**
 * -------------------------------------------------
 * File name: AddOrcs.java
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
import cs2.projects.project4.models.Orc;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddOrcs implements MenuCommand {
    private final String COMMAND_NAME = "Add Orcs";
    private Encounter encounter;

    public AddOrcs(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numOrcsToGenerate = 0;

        System.out.print("Number of Orcs to generate: ");
        numOrcsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numOrcsToGenerate; i++) {
            encounter.addMonster(new Orc());
        }

        System.out.println("Added " +  numOrcsToGenerate + " Orcs.");
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
