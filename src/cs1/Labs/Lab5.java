package cs1.Labs;
/**
 * File Name: Lab5.java
 * Creator's Name: Connor Reed
 * Lab: 5
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 9/8/2020 @ 1 pm
 */


import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 A01");
        System.out.println("  |  |  |          Lab 2");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                ");


        // Brings in scanner object to code
        Scanner input = new Scanner(System.in);

        // asks user for v0
        System.out.print("Enter a value for starting velocity (v0): ");
        double v0 = input.nextDouble();

        // asks user for v1
        System.out.print("Enter a value for ending velocity (v1): ");
        double v1 = input.nextDouble();

        // asks user for time
        System.out.print("Enter a value for time: ");
        double t = input.nextDouble();

        //solves for acceleration
        double a = (v1 - v0) / t;

        // prints to console
        System.out.print("The acceleration is " + a + " for lab 5.");

    }
}
