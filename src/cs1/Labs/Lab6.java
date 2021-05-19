package cs1.Labs;
/**
 * File Name: Grade Scaler
 * Creator's Name: Connor Reed
 * Lab: 6
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science H03
 * Creation Date: 9/14/2020 @ 9 pm
 */



import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 A01");
        System.out.println("  |  |  |          Lab 6");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");
                // Introduce Scanner
            Scanner input = new Scanner(System.in);
                // Enter number to calculate grade letter
            System.out.print("Enter a score between 0 and 100 inclusive: ");
            int letter = input.nextInt();
                // if and else if statements
            if (letter > 100 || letter < 0)
                System.out.println("Invalid Input");
            else if (letter >= 90)
                System.out.println(letter + " = A");
            else if (letter >=80)
                System.out.println(letter + " = B");
            else if (letter >= 70)
                System.out.println(letter + " = C");
            else if (letter >= 65)
                System.out.println(letter + " = D");
            else
                System.out.println(letter + " = F");


    }
}
