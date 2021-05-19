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
import cs2.projects.project4.models.Zombie;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddZombies implements MenuCommand {
    private final String COMMAND_NAME = "Add Zombies";
    private Encounter encounter;

    public AddZombies(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numZomsToGenerate = 0;

        System.out.print("Number of Zombies to generate: ");
        numZomsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numZomsToGenerate; i++) {
            encounter.addMonster(new Zombie());
        }

        System.out.println("Added " +  numZomsToGenerate + " Zombies.");
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
