package cs2.labs.lab03;

import java.util.Scanner;
/**
 * File Name: edu.northeaststate.cs2.labs.edu.northeaststate.cs2.labs.lab03.Lab03.java
 * Creator's Name: Connor Reed
 * Lab: 03
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/19/2021
 */


public class Lab03 {
    /**
     * Purpose: Entry point for program
     * Public method: main
     * Description: Uses TreasureChest to create and store ArrayList of items
     * @return: void
     */

    public static void main(String[] args) {
        Scanner ItemOrValue = new Scanner(System.in);

        String itemNameInput;
        double itemValueInput;

        TreasureChest chest = new TreasureChest();

        // Start of loop, user entering a String for name of object
        System.out.print("Enter Item name: ");
        itemNameInput = ItemOrValue.nextLine();

        // Executes the while loop after user enters value of object name
        while(!itemNameInput.equals("quit")){

            // If user does not say quit the loop will cont
            System.out.print("Enter Item value: ");
            itemValueInput = ItemOrValue.nextDouble();

            Item item = new Item(itemNameInput,itemValueInput);
            chest.addItem(item);

            //Clears buffer for bug in Scanner Class (drops new line char)
            ItemOrValue.nextLine();

            // To start the loop again
            System.out.print("Enter Item name: ");
            itemNameInput = ItemOrValue.nextLine();
        }
        System.out.println("\n\tPrinting Treasure Chest Items");
        System.out.println(chest.toString());

        System.out.println("\n\tPicking Random Item");
        System.out.println(chest.getRandomItem());

        System.out.println("\nTotal number of items: ");
        System.out.println(chest.getNumItems() + "\n");

        System.out.println("Average value of items: ");
        System.out.print(String.format("%.2f",chest.getAvgValueOfItems()) +"\n");

    }
}