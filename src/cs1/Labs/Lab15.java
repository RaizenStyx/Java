package cs1.Labs;
/**
 * File Name: Lab15.java
 * Creator's Name: Connor Reed
 * Lab: 15
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 11/17/2020
 */
public class Lab15 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Lab 15");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");


        RegularPolygon regularPolygon1 = new RegularPolygon();

        RegularPolygon regularPolygon2 = new RegularPolygon(6,4.0);

        RegularPolygon regularPolygon3 = new RegularPolygon();

        regularPolygon3.setSideLength(1.25);
        regularPolygon3.setNumsides(12);


        System.out.println("Polygon 1 number of sides:"+regularPolygon1.getNumsides());
        System.out.println("Polygon 1 side length: "+ regularPolygon1.getSideLength());
        System.out.println("Polygon 1 perimeter: "+ regularPolygon1.calculatePerimeter());
        System.out.printf("Polygon 1 area: %4.2f", + regularPolygon1.calculateArea());

        System.out.println("\n\nPolygon 2 number of sides:"+regularPolygon2.getNumsides());
        System.out.println("Polygon 2 side length: "+ regularPolygon2.getSideLength());
        System.out.println("Polygon 2 perimeter: "+ regularPolygon2.calculatePerimeter());
        System.out.printf("Polygon 2 area: %4.2f",+ regularPolygon2.calculateArea());

        System.out.println("\n\nPolygon 3 number of sides:"+regularPolygon3.getNumsides());
        System.out.println("Polygon 3 side length: "+ regularPolygon3.getSideLength());
        System.out.println("Polygon 3 perimeter: " + regularPolygon3.calculatePerimeter());
        System.out.printf("Polygon 3 area: %4.2f",+ regularPolygon3.calculateArea());


    }
}





class RegularPolygon{
    private int numsides;

    private double sideLength;

    public RegularPolygon(){ numsides=3; sideLength=1; }

    public RegularPolygon(int newNumsides, double newSideLength){ numsides = newNumsides; sideLength = newSideLength; }

    public double calculatePerimeter() { return numsides * sideLength; }

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