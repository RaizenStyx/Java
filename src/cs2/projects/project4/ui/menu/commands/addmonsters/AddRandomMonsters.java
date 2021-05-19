/**
 * -------------------------------------------------
 * File name: AddRandomMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.addmonsters;

import cs2.projects.project4.models.MonsterGenerator;
import cs2.projects.project4.models.Encounter;
import cs2.projects.project4.ui.menu.commands.MenuCommand;
import java.util.Scanner;

public class AddRandomMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Add Randoms";
    private Encounter encounter;

    public AddRandomMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numRandToGenerate = 0;

        System.out.print("Number of Random Monsters to generate: ");
        numRandToGenerate = keyboard.nextInt();

        for (int i = 0; i < numRandToGenerate; i++) {
            encounter.addMonster(MonsterGenerator.getRandomMonster());
        }
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
