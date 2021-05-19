package cs1.Labs;
/**
 * File Name: Acceleration finder
 * Creator's Name: Connor Reed
 * Lab: 4
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 9/8/2020 @ 1 pm
 */


public class Lab4 {
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


        double v0 = 5.6;
        double v1 = 10.5;
        double t = 0.5;

        // solves for time from variables already assigned
        double a = (v1 - v0) / t;

        System.out.print("The acceleration is " + a + "  for lab 4.");

    }
}
