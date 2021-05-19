/**
 * -------------------------------------------------
 * File name: AddBanshees.java
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
import cs2.projects.project4.models.Banshee;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddBanshees implements MenuCommand {
    private final String COMMAND_NAME = "Add Banshees";
    private Encounter encounter;

    public AddBanshees(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numBansToGenerate = 0;

        System.out.print("Number of Banshees to generate: ");
        numBansToGenerate = keyboard.nextInt();

        for (int i = 0; i < numBansToGenerate; i++) {
            encounter.addMonster(new Banshee());
        }

        System.out.println("Added " +  numBansToGenerate + " Banshees.");
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
