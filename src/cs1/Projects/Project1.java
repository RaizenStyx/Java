package cs1.Projects;
/**
 * File Name: Project1.java
 * Creator's Name: Connor Reed
 * Lab: Project 1
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 9//15/2020
 */


import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Project 1");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");


        // Creating variables from user using prompt and if statements
        System.out.print("Enter a value for temperature (F): ");
        Scanner tempF = new Scanner(System.in);
        double temp = tempF.nextDouble();
        if (temp < -58.0 || temp > 70.0){
            System.out.print("Temperature is out of range, must be > -58F and < 70F");
            System.exit(0);
        }

        System.out.print("Enter a value for wind speed (MPH): ");
        Scanner windMPH = new Scanner(System.in);
        double wind = windMPH.nextDouble();
        if (wind < 2.0){
            System.out.print("Wind Speed is out of range, must be > 2 MPH");
            System.exit(0);
        }

        // Making constants for equation
        final double CHILL_1 = 35.74;
        final double CHILL_2 = 0.6215;
        final double CHILL_3 = 35.75;
        final double CHILL_4_6 = 0.16;
        final double CHILL_5 = 0.4275;

        // Plugging variables into equation
        double windChill = CHILL_1 + (CHILL_2*temp) - CHILL_3*(Math.pow(wind,CHILL_4_6))
                + (CHILL_5 * temp)*(Math.pow(wind,CHILL_4_6));

        // Printing to console the windchill rounded with a cast
        System.out.println((int)(windChill) + " is the windchill rounded");

    }
}