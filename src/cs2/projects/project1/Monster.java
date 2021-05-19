/**
 * File Name: edu.northeaststate.cs2.projects.project1.Monster.java
 * Creator's Name: Connor Reed
 * Project: 1 (Monster)
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020 Computer Science 1 HYB1
 * Creation Date: 02/24/2021
 */
package cs2.projects.project1;

public class Monster {
    // Attributes
    private String name;
    private int hitPoints;
    private int armorClass;
    private int attackDamage;

    /**
     * Description: Constructor for the monster object
     * Public Method
     * Date: 02/24/2021
     * @param name
     * @param hitPoints
     * @param armorClass
     * @param attackDamage
     */
    public Monster(String name, int hitPoints, int armorClass, int attackDamage){
        this.name = name;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.attackDamage = attackDamage;
    }

    /**
     * Description: Returns the name of monster
     * Public Method
     * Date: 02/24/2021
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Description: Sets the name of a monster
     * Public Method
     * Date: 02/24/2021
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description: Returns the hit points of monster
     * Public Method
     * Date: 02/24/2021
     * @return int
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Description: Sets the hit points of a monster
     * Public Method
     * Date: 02/24/2021
     * @param hitPoints
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Description: Returns the armor class of monster
     * Public Method
     * Date: 02/24/2021
     * @return int
     */
    public int getArmorClass() {
        return armorClass;
    }

    /**
     * Description: Sets the armor class of a monster
     * Public Method
     * Date: 02/24/2021
     * @param armorClass
     */
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    /**
     * Description: Returns the attack damage of monster
     * Public Method
     * Date: 02/24/2021
     * @return int
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Description: Sets the attack damage of a monster
     * Public Method
     * Date: 02/24/2021
     * @param attackDamage
     */
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    /**
     * Description: A to string method to tell user all attributes of monster
     * in string form
     * Public Method
     * Date: 02/24/2021
     * @return String
     */
    @Override
    public String toString() {
        return "\n    Monster " +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", armorClass=" + armorClass +
                ", attackDamage=" + attackDamage;
    }
}
