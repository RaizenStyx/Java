package cs1.Projects;
/**
 * File Name: Project2.java
 * Creator's Name: Connor Reed
 * Lab: Project 2
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 10/16/2020
 */
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
    // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Project 2");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");

        // Rules
        System.out.print("Choose your hand against the computer.\n"+
                "  Grimm defeats Reaper\n  Reaper defeats Death\n "+
                " Death defeats Grimm\n\nEnter your hand number\n  Grimm [1], Reaper [2], Death [3] : ");

        // User number and computer number generated
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        int compNumber = (int)(Math.random() *3)+1;

        // Switch for user number and if else statements for computer number.
        // Determines winner and checks for validation
        switch (userNumber) {
            case 1:
            System.out.println("    Player hand: Grimm");
            if (compNumber == 2)
                System.out.println("  Computer hand: Reaper" +
                        "\n-> Grimm defeats Reaper! Player wins!");
            else if (compNumber == 3)
                System.out.println("  Computer hand: Death" +
                        "\n-> Death defeats Grimm! Computer wins!");
            else if (compNumber == 1)
                System.out.println("  Computer hand: Grimm" +
                        "\n-> Grimm versus Grimm is a tie!");
            break;
            case 2:
                System.out.println("    Player hand: Reaper");
            if (compNumber == 3)
                System.out.println("  Computer hand: Death" +
                        "\n-> Reaper defeats Death! Player wins!");
            else if (compNumber == 1)
                System.out.println("  Computer hand: Grimm" +
                        "\n-> Grimm defeats Reaper! Computer wins!");
            else if (compNumber == 2)
                System.out.println("  Computer hand: Reaper" +
                        "\n-> Reaper versus Reaper is a tie!");
            break;
            case 3:
                System.out.println("    Player hand: Death");
            if (compNumber == 1)
                System.out.println("  Computer hand: Grimm" +
                        "\n-> Death defeats Grimm! Player wins!");
            else if (compNumber == 2)
                System.out.println("  Computer hand: Reaper" +
                        "\n-> Reaper defeats Death! Computer wins!");
            else if (compNumber == 3)
                System.out.println("  Computer hand: Death" +
                        "\n-> Death versus Death is a tie!");
            break;
            default:
                System.out.println("->You have entered an invalid number");
        }
    }
}
