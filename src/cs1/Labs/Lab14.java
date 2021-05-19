package cs1.Labs;
/**
 * File Name: Lab14.java
 * Creator's Name: Connor Reed
 * Lab: 14
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 11/17/2020
 */
public class Lab14 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Lab 14");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");


        double[][] myArray = {
                {1.1, 2.2, 3.3, 4.4},
                {5.5, 6.6, 7.7, 8.8},
                {9.9, 10.10, 11.11, 12.12}
        };
        for (int i = 0; i <= myArray.length; i++) {
            System.out.println("Sum for elements at column "+ i +" is "+
                    sumColumn(myArray, i));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double total = 0;
        for (int row = 0; row < m.length; row++)
            total += m[row][columnIndex];
        return total;
    }
}
