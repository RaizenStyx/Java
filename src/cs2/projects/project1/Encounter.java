/**
 * File Name: edu.northeaststate.cs2.projects.project1.Encounter.java
 * Creator's Name: Connor Reed
 * Project: 1 (Encounter)
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/24/2021
 */
package cs2.projects.project1;

import java.util.ArrayList;

public class Encounter {
    // Attributes
    private String name;
    private ArrayList<Monster> monsters;

    /**
     * Constructor for the encounter of monster
     * Public Method
     * Date: 02/24/2021
     * @param name
     */
    public Encounter(String name){
       this.name = name;
       this.monsters = new ArrayList<>();
    }

    /**
     * Description: Returns the name of monster
     * Public Method
     * Date: 02/24/2021
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Description: Returns the monster in ArrayList
     * Public Method
     * Date: 02/24/2021
     * @return monsters
     */
    public ArrayList<Monster> getMonsters(){
        return this.monsters;
    }

    /**
     * Description: Adds a monster object to ArrayList
     * Public Method
     * Date: 02/24/2021
     * @param monster
     */
    public void addMonster(Monster monster){
        monsters.add(monster);
    }

    /**
     * Description: Creates and adds a monster object to ArrayList
     * Public Method
     * Date: 02/24/2021
     * @param name
     * @param hitPoints
     * @param armorClass
     * @param attackDamage
     */
    public void addMonster(String name, int hitPoints, int armorClass,
                           int attackDamage){
        monsters.add(new Monster(name, hitPoints, armorClass, attackDamage));
    }

    /**
     * Description: Counts total monsters from encounter
     * Public Method
     * Date: 02/24/2021
     */
    public int calculateTotalMonsters(){
       return monsters.size();
    }

    /**
     * Description: Returns total hit points from all monsters in encounter
     * Public Method
     * Date: 02/24/2021
     * @return int
     */
    public int calculateTotalHitPoints(){
        int totalHP = 0;
        for (int i = 0; i < monsters.size(); i++) {
            totalHP += monsters.get(i).getHitPoints();
        }
        return totalHP;
    }

    /**
     * Description: Returns average hit points from all monsters in encounter
     * Public Method
     * Date: 02/24/2021
     * @return double
     */
    public double calculateAvgHitPoints(){
        double avgHP = 0;
        for (int i = 0; i < monsters.size(); i++) {
            avgHP += monsters.get(i).getHitPoints();
        }
        return avgHP/monsters.size();
    }

    /**
     * Description: Returns average armor class from all monsters in encounter
     * Public Method
     * Date: 02/24/2021
     * @return double
     */
    public double calculateAvgArmorClass(){
        double avgArmor = 0;
        for (int i = 0; i < monsters.size(); i++) {
            avgArmor += monsters.get(i).getArmorClass();
        }
        return avgArmor/monsters.size();
    }

    /**
     * Description: Returns average attack damage from all monsters in encounter
     * Public Method
     * Date: 02/24/2021
     * @return double
     */
    public double calculateAvgAttackDamage(){
        double avgAttack = 0;
        for (int i = 0; i < monsters.size(); i++) {
            avgAttack += monsters.get(i).getAttackDamage();
        }
        return avgAttack/monsters.size();
    }

    /**
     * Description: A to string method to tell user of name of monster and the
     * monster object attributes in string form
     * Public Method
     * Date: 02/24/2021
     * @return String
     */
    @Override
    public String toString() {
        return "Encounter{" +
                "name='" + name + '\'' +
                ", monsters=" + monsters +
                '}';
    }
}
