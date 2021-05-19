package cs2.labs.lab01;

/**
 * File Name: edu.northeaststate.cs2.labs.RegularPolygon.java
 * Creator's Name: Connor Reed
 * Lab: 01
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/01/2021
 */

//Creates a Regular Polygon class to use for edu.northeaststate.cs2.labs.Lab01 file

public class RegularPolygon extends Lab01 {
    private int numsides;

    private double sideLength;

    public RegularPolygon(){
        numsides=3; sideLength=1;
    }
    public RegularPolygon(int newNumsides, double newSideLength){
        numsides = newNumsides; sideLength = newSideLength;
    }
    public double calculatePerimeter() {
        return numsides * sideLength;
    }
    public double calculateArea() {
        return (numsides) * Math.pow(sideLength, 2) / +
                (4 * Math.tan(Math.PI/(numsides)));
    }
    public int getNumsides() {
        return numsides;
    }
    public double getSideLength() {
        return sideLength;
    }
    public void setNumsides(int numsides) {
        this.numsides = numsides;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

}
