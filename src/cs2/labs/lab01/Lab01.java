package cs2.labs.lab01;

/**
 * File Name: edu.northeaststate.cs2.labs.Lab01.java
 * Creator's Name: Connor Reed
 * Lab: 01
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/01/2021
 */

public class Lab01 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();

        RegularPolygon regularPolygon2 = new RegularPolygon(6,4.0);

        RegularPolygon regularPolygon3 = new RegularPolygon();

        regularPolygon3.setSideLength(1.25);
        regularPolygon3.setNumsides(12);


        System.out.println("Polygon 1 number of sides:"+(double) regularPolygon1.getNumsides());
        System.out.println("Polygon 1 side length: "+ regularPolygon1.getSideLength());
        System.out.println("Polygon 1 perimeter: "+ regularPolygon1.calculatePerimeter());
        System.out.printf("Polygon 1 area: %4.2f", + regularPolygon1.calculateArea());

        System.out.println("\n\nPolygon 2 number of sides:"+(double)regularPolygon2.getNumsides());
        System.out.println("Polygon 2 side length: "+ regularPolygon2.getSideLength());
        System.out.println("Polygon 2 perimeter: "+ regularPolygon2.calculatePerimeter());
        System.out.printf("Polygon 2 area: %4.2f",+ regularPolygon2.calculateArea());

        System.out.println("\n\nPolygon 3 number of sides:"+(double) regularPolygon3.getNumsides());
        System.out.println("Polygon 3 side length: "+ regularPolygon3.getSideLength());
        System.out.println("Polygon 3 perimeter: " + regularPolygon3.calculatePerimeter());
        System.out.printf("Polygon 3 area: %4.2f",+ regularPolygon3.calculateArea());
        System.out.println("\n");
    }
}
