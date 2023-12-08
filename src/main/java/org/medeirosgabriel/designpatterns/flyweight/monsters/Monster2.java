package org.medeirosgabriel.designpatterns.flyweight.monsters;

import java.io.Serializable;

public class Monster2 implements Serializable {

    private int age;
    private int life;
    private String name;
    private float height;
    private int strength;
    private int defense;

    public Monster2(int age, int life, String name, float height, int strength, int defense) {
        this.age = age;
        this.life = life;
        this.name = name;
        this.height = height;
        this.strength = strength;
        this.defense = defense;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
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
