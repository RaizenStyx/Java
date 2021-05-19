/**
 * File Name: edu.northeaststate.cs2.projects.project1.EncounterDriver.java
 * Creator's Name: Connor Reed
 * Project: 1
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/24/2021
 */
package cs2.projects.project1;

import java.util.ArrayList;
import java.util.Scanner;

public class EncounterDriver {
    public static void main(String[] args) {
        // Sets Variables
        String encounterName;
        String name;
        int hitPoints;
        int armorClass;
        int attackDamage;
        String clearBuff;
        Scanner input = new Scanner(System.in);
        ArrayList<Encounter> encounterArrayList = new ArrayList<>();

        // Starts loops with first encounter
        System.out.print("Enter encounter name(quit when done): ");
        encounterName = input.nextLine();

        // Makes new encounter and assigns it the encounter name
        Encounter encounter = new Encounter(encounterName);

        // Adds encounter to Array list of Encounters if its is not 'quit'
        if (!encounterName.equals("quit")){
            encounter = new Encounter(encounterName);
            encounterArrayList.add(encounter);
        }

        // Start of while loop, asks for first set of monster attributes
        while (!encounterName.equals("quit")){

            // Gathers input
            System.out.print("Enter monster name: ");
            name = input.nextLine();

            System.out.print("Enter monster hit points: ");
            hitPoints = input.nextInt();

            System.out.print("Enter monster armor class: ");
            armorClass = input.nextInt();

            System.out.print("Enter monster attack damage: ");
            attackDamage = input.nextInt();

            // Makes a new monster with the variables entered and adds to encounter
            encounter.addMonster(new Monster(name, hitPoints, armorClass, attackDamage));

            // Clears scanner bug
            clearBuff = input.nextLine();

            // Asks to add another monster to encounter if desired
            System.out.print("Enter another monster to "+encounterName+"? ");

            // Clear Scanner bug yet again
            clearBuff = input.nextLine();

            // Another while loop if user wants to enter another monster
            while (clearBuff.equals("y") || clearBuff.equals("Y")){

                // Second Set of monster attributes
                System.out.print("Enter monster name: ");
                name = input.nextLine();

                System.out.print("Enter monster hit points: ");
                hitPoints = input.nextInt();

                System.out.print("Enter monster armor class: ");
                armorClass = input.nextInt();

                System.out.print("Enter monster attack damage: ");
                attackDamage = input.nextInt();

                encounter.addMonster(new Monster(name, hitPoints, armorClass, attackDamage));

                // Clear the bug...again
                clearBuff = input.nextLine();

                // Asks if user wants to enter another monster
                System.out.print("Enter another monster to "+encounterName+"? ");

                // Yes, another bug clear
                clearBuff = input.nextLine();
            }

            // Asks user if they want to enter another encounter and adds if not quit
            System.out.print("Enter encounter name(quit when done): ");
            encounterName = input.nextLine();
            if (!encounterName.equals("quit")){
                encounter = new Encounter(encounterName);
                encounterArrayList.add(encounter);
            }

        }

        // Encounter Report. Tells all info of monster and the encounters
        System.out.println("Encounter Report");
        System.out.println("--------------------------");
        System.out.println("  Number of encounters: " + encounterArrayList.size()+"\n");

        for (int i = 0; i < encounterArrayList.size(); i++) {
            System.out.println("Encounter name: "+
                    encounterArrayList.get(i).getName());

            System.out.println("  Total monsters: " +
                    encounterArrayList.get(i).calculateTotalMonsters());

            System.out.println("  Total hit points: "+
                    encounterArrayList.get(i).calculateTotalHitPoints());

            System.out.println("  Average hit points: "+
                    encounterArrayList.get(i).calculateAvgHitPoints());

            System.out.println("  Average armor class: "+
                    encounterArrayList.get(i).calculateAvgArmorClass());

            System.out.println("  Average attack damage: "+
                    encounterArrayList.get(i).calculateAvgAttackDamage());

            System.out.println("  Monsters: " +
                    encounterArrayList.get(i).getMonsters().toString() + "\n");

        }
    }
}
