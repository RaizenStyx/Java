package cs1.Labs;
/**
 * File Name: Lab8.java
 * Creator's Name: Connor Reed
 * Lab: 8
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 9/25/2020
 */


import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Lab 8");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");


        Scanner input = new Scanner(System.in);

        // Creating value for number of sides and tests if valid
        System.out.print("Number of sides: ");
        int sideNumber = input.nextInt();
        if (sideNumber < 3){
            System.out.print("Must be more than 2 sides");
            System.exit(0);
        }

        // Creating value for length of one side
        System.out.print("Length of a side: ");
        double length = input.nextDouble();
        if (length <= 0){
            System.out.print("Length of a side must be more than 0");
            System.exit(0);
        }

        // Creates a value for the area using formula
        double area = (double)(sideNumber) * Math.pow(length, 2) / +
                (4 * Math.tan(Math.PI/(double)(sideNumber)));


        System.out.print("The area of a Polygon with " + sideNumber +" sides "+
                "and the length of each side being "+ length+" is "+ (float)(area));

    }
}