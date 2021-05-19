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
/**
 * Class that provides assembly methods to use with AssemblyDriver
 */
public class Assembly {
    private String name;
    private ArrayList<Part> parts;

    /**
     * Parameterized constructor
     * @param name
     */
    public Assembly(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }

    /**
     * Gets the name of the part
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Parameterized constructor
     * @param partNumber
     * @param serialNumber
     * @param weight
     * @param surfaceArea
     */
    public void addPart (String partNumber, String serialNumber,
                         int weight, double surfaceArea) {
        parts.add(new Part(partNumber, serialNumber, weight, surfaceArea));
    }

    /**
     * Calculates the total surface area of the part
     * @return double surface area
     */
    public double calculateTotalSurfaceArea() {
        double totalSA = 0.0;

        for (Part part: parts) {
            totalSA += part.getSurfaceArea();
        }
        return totalSA;
    }

    /**
     * Calculates the total weight of the part
     * @return int weight
     */
    public int calculateTotalWeight() {
        int totalWeight = 0;

        for (Part part: parts) {
            totalWeight += part.getWeight();
        }
        return totalWeight;
    }

    /**
     * Makes a string of all of the assembly
     * @return
     */
    @Override
    public String toString() {
        return "Assembly{" +
                "name='" + name + '\'' +
                ", parts=" + parts +
                '}';
    }
}
