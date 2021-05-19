/**
 * -------------------------------------------------
 * File name: SaveEncounterFromFile.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */

package cs2.projects.project4.ui.menu.commands.mainmenu;

import cs2.projects.project4.data.FileAccess;
import cs2.projects.project4.models.Encounter;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

import java.io.IOException;
import java.util.Scanner;


public class SaveEncounterToFile implements MenuCommand{
    private Encounter encounter;

    public SaveEncounterToFile(Encounter encounter){
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter file name to save: ");
        String filename = keyboard.nextLine().trim();
        try {
            FileAccess file = new FileAccess(filename);
            file.saveEncounterFile(this.encounter);
            System.out.println("\n\nFile Saved.");
        } catch (IOException e){
            System.out.println("File Save Error.");
            System.out.println(e.getMessage());
        }

    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Save Encounter to File";
    }
}
