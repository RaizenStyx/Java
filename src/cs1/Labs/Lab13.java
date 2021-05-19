package cs1.Labs;
/**
 * File Name: Lab13.java
 * Creator's Name: Connor Reed
 * Lab: 13
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 11/17/2020
 */
import java.util.Scanner;
public class Lab13 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Lab 13");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");

        // Gets total number of students from user
        System.out.print("Enter total number of students: ");
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();

        // creates array with students as max
        double[] list = new double[students];

        //gets scores and places them into array
        System.out.print("Enter "+ students +" scores: ");
        Scanner scores = new Scanner(System.in);
        for (int i = 0; i < list.length ; i++) {
            double score = scores.nextDouble();
            list[i] = score;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 100 || list[i] < 0)
                System.out.println("Invalid Input");
            else if (list[i] >= 90)
                System.out.println("Student "+ i + " score is "
                        + list[i] + " and grade is A");
            else if (list[i] >=80)
                System.out.println("Student "+ i + " score is "
                        + list[i] + " and grade is B");
            else if (list[i] >= 70)
                System.out.println("Student "+ i + " score is "
                        + list[i] + " and grade is C");
            else if (list[i] >= 65)
                System.out.println("Student "+ i + " score is "
                        + list[i] + " and grade is D");
            else
                System.out.println("Student "+ i + " score is "
                        + list[i] + " and grade is F");
        }



    }
}
