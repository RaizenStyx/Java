package cs1.Labs;
/**
 * File Name: Celsius to Fahrenheit Converter
 * Creator's Name: Connor Reed
 * Lab: 3
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1
 * Creation Date: 9/2/2020 @ 9 pm
 */



import java.util.Scanner;

public class Lab3 {
    /**
        Method Description: Will print cool intro message
        Styx Gaming Alias
        Date 9/1/2020
     */
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
        /**
        Purpose: Scanner object will let System know how to ask user for input
        Date Created: 9/2/2020
        @author: Connor Reed
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        /**
        Purpose: This will prompt the system to ask the user for a input and convert
                 it into a decimal number.
         */
        double celsius = input.nextDouble();
        /**
        Purpose: Take the celsius and evaluate an expression to find Fahrenheit
         */
        double fahrenheit = (celsius*9/5) + 32;
        /**
        Purpose: Will display the evaluated expression from above into a sentence
                 and display it to the console.
         */
        System.out.println("Celsius "+ celsius+" is "+ fahrenheit+
                "in Fahrenheit");


    }



}