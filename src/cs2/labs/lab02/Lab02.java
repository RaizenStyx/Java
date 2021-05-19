package cs2.labs.lab02;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * File Name: edu.northeaststate.cs2.labs.edu.northeaststate.cs2.labs.lab02.Lab02.java
 * Creator's Name: Connor Reed
 * Lab: 02
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/15/2021
 */

public class Lab02 {
    /** Purpose: Entry point for program
     * Public method: main
     * Description: Makes an arraylist, takes user input and stores the values
     * as objects into list with a while loop, then prints the list of values
     * of the objects and picks a random one.
     */

    public static void main(String[] args) {
        // Scanner class for user input
        Scanner ItemOrValue = new Scanner(System.in);

        // Initializes the variables used later for the user input
        String itemNameInput;
        double itemValueInput;

        // Initializes the arraylist of objects
        ArrayList<Item> myItems = new ArrayList<>();
        Item item;

        // Creates a random value with a seed of 0
        Random random = new Random(0);

        // Start of loop, user entering a String for name of object
        System.out.print("Enter Item name: ");
        itemNameInput = ItemOrValue.nextLine();

        // Executes the while loop after user enters value of object name
        while(!itemNameInput.equals("quit")){

            // If user does not say quit the loop will cont
            System.out.print("Enter Item value: ");
            itemValueInput = ItemOrValue.nextDouble();

            //Creates Item object
            item = new Item(itemNameInput, itemValueInput);
            // Places Item object into array list myItems
            myItems.add(item);

            //Clears buffer for bug in Scanner Class (drops new line char)
            ItemOrValue.nextLine();

            // To start the loop again
            System.out.print("Enter Item name: ");
            itemNameInput = ItemOrValue.nextLine();
        }

        // Will print the list of items with a for loop
        System.out.println("\n        Print Items");
        for (Item i: myItems){
            System.out.println(i);
        }

        // Prints a random item from list with use of random class
        System.out.println("\n        Pick Random item");
        System.out.println(myItems.get(random.nextInt(myItems.size())));

    }
}