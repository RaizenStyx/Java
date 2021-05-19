/**
 * File Name: edu.northeaststate.cs2.labs.lab04.Lab04.java
 * Creator's Name: Connor Reed
 * Lab: 04
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 03/06/2021
 */

package cs2.labs.lab04;

public class Lab04 {
    public static void main(String[] args) {

        Item item1 = new Item("Item 1", 200);
        Item item2 = new Item("Item 1", 200);

        if (item1.equals(item2)){
            System.out.println("Item 1 and Item 2 are equal");
        }else{
            System.out.println("Item 1 and Item 2 are not equal");
        }

        Item item3 = new Item("Item 3", 100);
        Item item4 = new Item("Item 4",100);

        if (item3.equals(item4)){
            System.out.println("Item 3 and Item 4 are equal");
        }else{
            System.out.println("Item 3 and Item 4 are not equal");
        }

        System.out.println("Item 1 hashcode is "+item1.hashCode());
        System.out.println("Item 2 hashcode is "+item2.hashCode());
        System.out.println("Item 3 hashcode is "+item3.hashCode());
        System.out.println("Item 4 hashcode is "+item4.hashCode());

    }
}
