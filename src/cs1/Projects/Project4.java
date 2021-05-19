package cs1.Projects;
/**
 * File Name: Project4.java
 * Creator's Name: Connor Reed
 * Project: 4
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 11/05/2020
 */

import java.util.Scanner;
public class Project4 {
    public static void main(String[] args){
        // printWelcomeMessage(); Was not mentioned being used so its commented out
        String numDicePrompt = "Enter the number of dice to roll(0 to exit): ";
        String numSides = "Enter the number of sides on your dice: ";

        // Part A = Prompts for user to enter numDice and sideDice
        int numDice =promptForInteger(numDicePrompt);
        while (numDice > 0) {

            // Part B = Prompt
            int numSide =promptForInteger(numSides);
            int [] numDiceArray = new int[numDice];
            int [] sortDiceArray = new int [numDiceArray.length];

            // Part C = Creates random array
            randomizeArray(numDiceArray,numSide);

            // Part D = Display array, sort, then display sorted array
            System.out.print("Rolling "+ numDiceArray.length+ "d"+numSide+":   ");
            printArray(numDiceArray);

            for (int i = 0; i < numDiceArray.length; i++) {
                sortDiceArray[i] = numDiceArray[i];
            }       // this makes a new array with the same values as the first

            selectionSort(sortDiceArray);
            System.out.print("Sorting Array: ");
            printArray(sortDiceArray);

            //Part E = Sum, Max, Min, Average, Median
            System.out.println("       Sum: " + findSum(numDiceArray));
            System.out.println("   Maximum: "+findMax(numDiceArray));
            System.out.println("   Minimum: "+findMin(numDiceArray));
            System.out.printf("   Average: %4.2f", findAverage(numDiceArray));
            System.out.printf("\n    Median: %4.2f", findMedian(sortDiceArray));

            //Part F = Enter integer for linear and binary search
            String stringKey ="\nEnter an integer to search for: ";
            int key = promptForInteger(stringKey);

            // Part G =Linear and Binary search
            System.out.print("   Linear search: "+key+" found at index "+
                    linearSearch(numDiceArray, key)+'\n');
            System.out.print("   Binary search: "+key+" found at index "+
                    binarySearch(sortDiceArray, key)+'\n');

            // Part H = Asking again for exit
            String endPrompt = "\nEnter the number of dice to roll(0 to exit): ";
            numDice =promptForInteger(endPrompt);
        }
        // Threw this in there to look nice when exiting
        System.out.println("-> Exiting");
    }
    // Intro Alias
    public static void printWelcomeMessage(){
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Project 4");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");
    }

    // takes string and creates a prompt for user to enter values
    // and returns them
    public static int promptForInteger(String prompt){
        System.out.print(prompt);
        Scanner intPrompt = new Scanner(System.in);
        return intPrompt.nextInt();
    }

    // takes empty array of dice number and sides of dice
    public static void randomizeArray(int[] list, int numSides) {
        for (int i = 0; i < list.length; i++){
            list[i] = (int) (Math.random() * numSides) + 1;
        }
    }
    // prints array
    public static void printArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    // Does a linear search and returns the index if values match or -1 if not
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i <list.length; i++) {
            if (key == list[i])
            return i;
        }
        return -1;
    }

    //Does a binary search and returns the index if values match or a negative if not
    public static int binarySearch(int[] list,int key){
        int low = 0;
        int high = list.length -1;
        while (high >= low){
            int mid = (low + high) /2;
            if (key < list[mid])
                high = mid - 1;
             else if (key == list[mid])
                return mid;
             else
                low = mid + 1;
        }
        return -low - 1;
    }
    // Takes a random array and sorts it in ascending order
    public static void selectionSort(int[] key){
        for (int i = 0; i < key.length - 1; i++) {
            int currentMin = key[i];
            int currentMinIndex = i;

            for (int j = i +1; j < key.length; j++) {
                if (currentMin > key[j] ){
                    currentMin = key[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                key[currentMinIndex] = key[i];
                key[i]= currentMin;
            }
        }
    }
    // Takes all values from array and finds sum
    public static int findSum(int[] list){
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        return total;
    }
    // Finds Max value
    public static int findMax(int[] list){
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[i] > max) max = list[i];
        }
        return max;
    }
    // Finds Min value
    public static int findMin(int[] list){
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i]< min) min = list[i];
        }
        return min;
    }
    // Finds average of array values
    public static double findAverage(int[] list){
        double ave = 0;
        double total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
            if (i == list.length-1) {
                ave = total/list.length;
            }
        }
        return ave;
    }
    // finds Middle value of array
    public static double findMedian(int[] list){
        if (list.length % 2==0){
            int med = list.length /2;
            return (double)(list[med]+list[med-1]) /2;
        } else{
            int med = list.length /2;
            return list[med];
        }
    }


}
