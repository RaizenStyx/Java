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
/**
 * Helper class with static methods for parsing String input
 */
public class Helper {

    /**
     * Takes a string and converts it to a positive integer,
     * if input string is not a positive integer (text or integer < 1) the method will return a -1
     * @param testString input String
     * @return a positive int
     */
    public static int isPositiveInteger(String testString) {
        int x;

        try {
            x = Integer.parseInt(testString);

            if (x < 1) {
                x = -1;
            }
        } catch (Exception e) {
            x = -1;
        }

        return x;
    }

    /**
     * Takes a string and converts it to a positive double,
     * if input string is not a positive double (text or number not greater than 0) the method will return a -1.0
     * @param testString input String
     * @return a positive double
     */
    public static double isPositiveDouble(String testString) {
        double x;
        try {
            x = Double.parseDouble(testString);

            if (!(x > 0.0)) {
                x = -1.0;
            }
        } catch (Exception e) {
            x = -1.0;
        }

        return x;
    }
}
