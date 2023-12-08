package org.medeirosgabriel.designpatterns.flyweight.monsters;

import java.io.Serializable;

public class MonsterType implements Serializable {

    private String name;
    private float height;
    private int strength;
    private int defense;

    public MonsterType(String name, float height, int strength, int defense) {
        this.name = name;
        this.height = height;
        this.strength = strength;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
