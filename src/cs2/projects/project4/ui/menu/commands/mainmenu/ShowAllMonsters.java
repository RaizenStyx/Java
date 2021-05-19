/**
 * -------------------------------------------------
 * File name: ShowAllMonsters.java
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
import cs2.projects.project4.models.Monster;
import cs2.projects.project4.ui.menu.commands.MenuCommand;

public class ShowAllMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Show All Monsters";
    private Encounter encounter;

    public ShowAllMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        if(encounter.getMonsters().size() == 0){
            System.out.println("No Monsters in Encounter");
        }else{
            for (Monster monster : encounter.getMonsters()) {
                System.out.println(monster.toString());
            }
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
