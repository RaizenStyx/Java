/**
 * -------------------------------------------------
 * File name: LoadEncounterFromFile.java
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
import cs2.projects.project4.ui.menu.commands.MenuCommand;
import cs2.projects.project4.data.FileAccess;

import java.util.Scanner;

public class LoadEncounterFromFile implements MenuCommand {
    private Encounter encounter;

    public LoadEncounterFromFile(Encounter encounter){
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file name to load: ");

        String filename = keyboard.nextLine().trim();
        try {
            FileAccess file = new FileAccess(filename);
            file.openEncounterFile(this.encounter);
        } catch (Exception e){
            System.out.println("==============Error==============");
            System.out.println("\n"+ e.getMessage() +"\n");
            System.out.println("==========================================");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Load Encounter from File";
    }
}
