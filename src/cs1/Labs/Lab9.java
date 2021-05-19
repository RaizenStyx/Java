package cs1.Labs;
/**
 * File Name: Lab10.java
 * Creator's Name: Connor Reed
 * Lab: 10
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 10/19/2020
 */



public class Lab9 {
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


        System.out.println("D&D Dice Roller");

        double d4 = Math.random()*4+1;
        System.out.println("d4 roll = "+(int)d4);

        double d6 = Math.random()*6+1;
        System.out.println("d6 roll = "+(int)d6);

        double d8 = Math.random()*8+1;
        System.out.println("d8 roll = "+(int)d8);

        double d10 = Math.random()*10+1;
        System.out.println("d10 roll = "+(int)d10);

        double d12 = Math.random()*12+1;
        System.out.println("d12 roll = "+(int)d12);

        double d20 = Math.random()*20+1;
        System.out.println("d20 roll = "+(int)d20);

        double d100 = Math.random()*100+1;
        System.out.println("d100 roll = "+(int)d100);


    }

}
