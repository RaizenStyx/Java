package cs1.Projects;
/**
 * File Name: Project5.java
 * Creator's Name: Connor Reed
 * Project: 5
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1010 Computer Science 1 HO3
 * Creation Date: 11/19/2020
 */
public class Project5 {
    public static void main(String[] args) {
        // Intro Alias
        System.out.println("     ^     ");
        System.out.println("    / \\  ");
        System.out.println("   / | \\           Online Gamer");
        System.out.println("  |  |  |          Turned Programmer");
        System.out.println("   \\ \\ /           Connor Reed");
        System.out.println("   / \\ \\           CISP 1010 H03");
        System.out.println("  |  |  |          Project 5");
        System.out.println("   \\ | /   | |    \\    /   \\  /        ");
        System.out.println("    \\ /  --|-|--   \\  /     \\/          ");
        System.out.println("     v     | |      \\/      /\\        ");
        System.out.println("                    /      /  \\     ");
        System.out.println("  Gaming Alias     /                \n\n");

        // Creates rectangle objects
        Rectangle rectangle1 = new Rectangle();


        Rectangle rectangle2 = new Rectangle(4.0,4.0);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setWidth(3.5);
        rectangle3.setHeight(7.0);

        // Using object methods and displaying
        // Object rectangle one
        System.out.println("The area of a rectangle with width "+
                rectangle1.getWidth() + " and height "+
                rectangle1.getHeight() + " is "+ rectangle1.calculateArea());
        System.out.println("The perimeter of this rectangle is "+
                rectangle1.calculatePerimeter());
        System.out.printf("The diagonal length is: %4.2f", +
                rectangle1.calculateDiagonal());
        System.out.println("\nIs this a square: " + rectangle1.isSquare()+ "\n");

        // Object rectangle two
        System.out.println("The area of a rectangle with width "+
                rectangle2.getWidth() + " and height "+
                rectangle2.getHeight() + " is "+ rectangle2.calculateArea());
        System.out.println("The perimeter of this rectangle is "+
                rectangle2.calculatePerimeter());
        System.out.printf("The diagonal length is: %4.2f", +
                rectangle2.calculateDiagonal());
        System.out.println("\nIs this a square: " + rectangle2.isSquare()+ "\n");

        // Object rectangle three
        System.out.println("The area of a rectangle with width "+
                rectangle3.getWidth() + " and height "+
                rectangle3.getHeight() + " is "+ rectangle3.calculateArea());
        System.out.println("The perimeter of this rectangle is "+
                rectangle3.calculatePerimeter());
        System.out.printf("The diagonal length is: %4.2f", +
                rectangle3.calculateDiagonal());
        System.out.println("\nIs this a square: " + rectangle3.isSquare());

    }
}

class Rectangle {
    private double width;

    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double newWidth, double newheight) {
        width = newWidth;
        height = newheight;
    }

    public double calculateArea() {
        double area = width * height;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = (Math.pow(width, 2)) + (Math.pow(height, 2));
        return diagonal = Math.sqrt(diagonal);
    }

    public boolean isSquare() {
        boolean result;
        if (height == width)
            result = true;
        else
            result = false;
        return result;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}