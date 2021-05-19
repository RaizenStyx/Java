/**
 * -------------------------------------------------
 * File name: Monster.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course and section: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */
package cs2.projects.project4.models;

import java.io.Serializable;

public abstract class Monster implements Serializable {
    protected String name;
    protected int hitPoints;
    protected int attackDamage;
    protected int armorClass;

    public Monster(String name, int hitPoints, int attackDamage, int armorClass) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.armorClass = armorClass;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getArmorClass() {
        return armorClass;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackDamage=" + attackDamage +
                ", armorClass=" + armorClass +
                '}';
    }
}


