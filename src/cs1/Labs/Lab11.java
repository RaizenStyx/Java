package cs1.Labs;
/**
 * File Name: Lab11.java
 * Creator's Name: Connor Reed
 * Lab: 11
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 10/19/2020
 */



public class Lab11 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Lab 9");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");


        System.out.print("Loop 1: ");
        for (int i = 0; i < 95; i=i+5) {
            System.out.print(i+" ");
        }

        System.out.print("\nLoop 2: ");
        for (int i = 60; i > 18 ; i=i-2) {
            System.out.print(i+" ");
        }

        System.out.print("\nLoop 3: ");
        for (int i = 1; i < 100; i++) {
            if ((i%2==0)&&(i%3==0)){
                System.out.print(i+" ");
            }
        }

    }
}
