package cs1.Labs;
/**
 * File Name: Lab 7
 * Creator's Name: Connor Reed
 * Lab: 7
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science H03
 * Creation Date: 9/14/2020 @ 9 pm
 */

import java.util.Scanner;
public class Lab7 {
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

        // Create Scanner and classes
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the month number in the year: ");
        int month = scan.nextInt();

        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        // Switch statement
        int day = 0;
        switch (month) {
            case 1:
                System.out.print("January");
                day = 31;
                break;
            case 2:
                System.out.print("February");
                // if statement to test leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    day = 29;
                else
                    day = 28;
                break;
            case 3:
                System.out.print("March");
                day = 31;
                break;
            case 4:
                System.out.print("April");
                day = 30;
                break;
            case 5:
                System.out.print("May");
                day = 31;
                break;
            case 6:
                System.out.print("June");
                day = 30;
                break;
            case 7:
                System.out.print("July");
                day = 31;
                break;
            case 8:
                System.out.print("August");
                day = 31;
                break;
            case 9:
                System.out.print("September");
                day = 30;
                break;
            case 10:
                System.out.print("October");
                day = 31;
                break;
            case 11:
                System.out.print("November");
                day = 30;
                break;
            case 12:
                System.out.print("December");
                day = 31;
                break;

            default:
                System.out.print("Invalid month");
        }
        // Print statement to tell user how many days a month has in a year
        System.out.println(" " + year + " has " + day + " days");


    }



}
