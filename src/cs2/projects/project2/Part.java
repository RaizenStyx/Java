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
 * Class that provides parts to the AssemblyDriver
 */
public class Part {
    private String partNumber;
    private String serialNumber;
    private int weight;
    private double surfaceArea;

    /**
     * Parameterized constructor
     * @param partNumber
     * @param serialNumber
     * @param weight
     * @param surfaceArea
     */
    public Part(String partNumber, String serialNumber, int weight, double surfaceArea) {
        this.partNumber = partNumber;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.surfaceArea = surfaceArea;
    }

    /**
     * Gets the part number of the part
     * @return partNumber
     */
    public String getPartNumber() {
        return this.partNumber;
    }

    /**
     * Setter for part number of the part
     * @param partNumber
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Gets the serial number of the part
     * @return serial number
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Setter for serial number of the part
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the weight of the part
     * @return weight
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Setter for weight of the part
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets the surface area of the part
     * @return surface area
     */
    public double getSurfaceArea() {
        return this.surfaceArea;
    }

    /**
     * Setter for surface area of the part
     * @param surfaceArea
     */
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    /**
     * Makes a string of the parts
     * @return
     */
    @Override
    public String toString() {
        return "Part {" +
                "partNumber='" + partNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", weight=" + weight +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}

