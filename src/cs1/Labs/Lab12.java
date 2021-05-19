package cs1.Labs;
/**
 * File Name: Lab12.java
 * Creator's Name: Connor Reed
 * Lab: 12
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 11/03/2020
 */

import java.util.Scanner;
public class Lab12 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Lab 12");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");

        //Prompts for values
        int inVal = promptForInteger("Enter an integer: ");
        double doubleVal = promptForDouble("Enter a double: ");
        short shortVal = promptForShort("Enter a short: ");
        long longVal = promptForLong("Enter a long: ");
        float floatVal = promptForFloat("Enter a float: ");
        System.out.print("Enter a character: ");
        char charVal = promptForChar("Enter a character: ");
        String stringVal = prompForString("Enter a String: ");


        //Displaying values
        System.out.println("intVal = "+ inVal);
        System.out.println("doubleVal = " +doubleVal);
        System.out.println("shortVal = "+ shortVal);
        System.out.println("longVal = "+ longVal);
        System.out.println("floatVal = " + floatVal);
        System.out.println("charVal = " + charVal);
        System.out.println("stringVal = " + stringVal);
    }

    // methods for values
        public static int promptForInteger(String prompt){
            Scanner scanner = new Scanner((System.in));
            System.out.print(prompt);
            return scanner.nextInt();
        }
        public static double promptForDouble(String prompt){
            Scanner scanner= new Scanner(System.in);
            System.out.print(prompt);
            return scanner.nextDouble();
        }
        public static short promptForShort(String prompt){
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);
            return scanner.nextShort();
        }
        public static long promptForLong(String prompt){
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);
            return scanner.nextLong();
        }
        public static float promptForFloat(String prompt){
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);
            return scanner.nextFloat();
        }
        public static char promptForChar(String prompt){
            Scanner scanner = new Scanner(System.in);
            return scanner.next().charAt(0);
        }
        public static String prompForString(String prompt){
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);
            return scanner.next();
        }


}


