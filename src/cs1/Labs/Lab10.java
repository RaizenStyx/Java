package cs1.Labs;
/**
 * File Name: Lab10.java
 * Creator's Name: Connor Reed
 * Lab: 10
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 10/19/2020
 */



public class Lab10 {
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

        double diceRoll;
        int total = 0;
        int i = 0;

        System.out.print("Roll 4d4 : ");
        for (i = 0; i < 4; i++) {
            diceRoll = Math.random() * 4 + 1;
            System.out.print((int) diceRoll + " ");
            total = total + (int)diceRoll;
            if (i == 3){
                System.out.print("Total = "+ total);
            }
        }
        total = 0;
        System.out.print("\nRoll 6d6 : ");
        for (i = 0; i < 6; i++) {
            diceRoll = Math.random() * 6 + 1;
            System.out.print((int) diceRoll+ " ");
            total = total + (int)diceRoll;
            if (i==5){
                System.out.print("Total = "+ total);
            }
        }

        total = 0;
        System.out.print("\nRoll 8d8 : ");
        i =0;
        while (i < 8) {
            diceRoll = Math.random() * 8 + 1;
            System.out.print((int) diceRoll+ " ");
            total = total +(int)diceRoll;
            if (i == 7){
                System.out.print("Total = "+ total);
            }
            i++;
        }

        total = 0;
        System.out.print("\nRoll 10d10 : ");
        i = 0;
        while(i < 10) {
            diceRoll = Math.random() * 10 + 1;
            System.out.print((int) diceRoll+ " ");
            total = total+(int)diceRoll;
            if (i==9){
                System.out.print("Total = "+ total);
            }
            i++;
        }

        System.out.print("\nRoll 12d12 : ");
        diceRoll = Math.random()*12+1;
        System.out.println((int)diceRoll);

        System.out.print("Roll 20d20 : ");
        diceRoll = Math.random()*20+1;
        System.out.println((int)diceRoll);

        System.out.print("Roll 100d100 : ");
        diceRoll = Math.random()*100+1;
        System.out.println((int)diceRoll);


    }

}
