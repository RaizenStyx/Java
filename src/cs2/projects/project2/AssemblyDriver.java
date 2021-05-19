/**
 * File Name: edu.northeaststate.cs2.projects.project2.java
 * Project Name: Project 2
 * --------------------------------------------------------------
 * Creator's Name: Isaac Cooper and Connor Reed
 * Email: icooper@northeaststate.edu
 * Course and Section: CISP 1020 HYB1
 * Creation Date: 3/21/2021
 */
package cs2.projects.project2;

import java.util.ArrayList;
import java.util.Scanner;

public class AssemblyDriver {
    public static void main(String[] args) {
        // Sets Variables
        String assemblyName;
        String partNumber;
        String serialNumber;
        String tempInput;
        int parsedInteger;
        double parsedDouble;
        String loopCheck;
        Scanner userInput = new Scanner(System.in);
        ArrayList<Assembly> assemblyArrayList = new ArrayList<>();

        // User input for assembly name
        System.out.print("Enter assembly name(quit when done): ");
        assemblyName = userInput.nextLine();

        // New assembly and assigns it a name
        Assembly assembly = new Assembly(assemblyName);

        // Checks to see if user wants to quit
        if (!assemblyName.equals("quit")){
            assembly = new Assembly(assemblyName);
            assemblyArrayList.add(assembly);
        }

        // Starts outer loop with a while statement
        while (!assemblyName.equals("quit")){

            //Gathers input from user to gain all info for part
            System.out.print("Enter part number: ");
            partNumber = userInput.nextLine();
            System.out.print("Enter serial number for part: ");
            serialNumber = userInput.nextLine();
            System.out.print("Enter part's weight: ");
            tempInput= userInput.nextLine();
            while ((parsedInteger = Helper.isPositiveInteger(tempInput))== -1){
                System.out.println(tempInput+" is not a positive integer.");
                System.out.print("Enter a positive integer: ");
                tempInput = userInput.nextLine();
            }

            System.out.print("Enter part's surface area: ");
            tempInput= userInput.nextLine();
            while ((parsedDouble = Helper.isPositiveDouble(tempInput))== -1){
                System.out.println(tempInput+" is not a positive double.");
                System.out.print("Enter a positive double: ");
                tempInput = userInput.nextLine();
            }

            assembly.addPart(partNumber, serialNumber, parsedInteger, parsedDouble);

            System.out.print("Enter another part to " + assemblyName+"?");

            loopCheck= userInput.nextLine();

            while (loopCheck.equals("y") || loopCheck.equals("Y")){

                //Gathers input from user to gain all info for next part
                System.out.print("Enter part number: ");
                partNumber = userInput.nextLine();
                System.out.print("Enter serial number for part: ");
                serialNumber = userInput.nextLine();
                System.out.print("Enter part's weight: ");
                tempInput= userInput.nextLine();
                while ((parsedInteger = Helper.isPositiveInteger(tempInput))== -1){
                    System.out.println(tempInput+" is not a positive integer.");
                    System.out.print("Enter a positive integer: ");
                    tempInput = userInput.nextLine();
                }

                System.out.print("Enter part's surface area: ");
                tempInput= userInput.nextLine();
                while ((parsedDouble = Helper.isPositiveDouble(tempInput))== -1){
                    System.out.println(tempInput+" is not a positive double.");
                    System.out.print("Enter a positive double: ");
                    tempInput = userInput.nextLine();
                }

                assembly.addPart(partNumber, serialNumber, parsedInteger, parsedDouble);

                System.out.print("Enter another part to " + assemblyName+"?");

                loopCheck= userInput.nextLine();
            }
            System.out.print("Enter assembly name(quit when done): ");
            assemblyName = userInput.nextLine();
            if (!assemblyName.equals("quit")){
                assembly = new Assembly(assemblyName);
                assemblyArrayList.add(assembly);

            }
        }
        // Assembly report
        System.out.println("Assembly Report");
        System.out.println("------------------------");
        System.out.println("  Number of Assemblies: "+ assemblyArrayList.size()+"\n");

        for (int i = 0; i < assemblyArrayList.size(); i++) {
            System.out.println("Assembly name: " + assemblyArrayList.get(i).getName());

            System.out.println("  Total surface are of all parts: " +
                    assemblyArrayList.get(i).calculateTotalSurfaceArea());

            System.out.println("  Total weight of all parts: " +
                    assemblyArrayList.get(i).calculateTotalWeight());

            System.out.println(assemblyArrayList.get(i).toString());
        }
    }
}
