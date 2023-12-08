package org.medeirosgabriel.designpatterns.flyweight.monsters;

import java.io.Serializable;

public class Monster1 implements Serializable {

    private MonsterType type;
    private int age;
    private int life;

    public Monster1(MonsterType type, int age, int life) {
        this.type = type;
        this.age = age;
        this.life = life;
    }

    public MonsterType getType() {
        return type;
    }

    public void setType(MonsterType type) {
        this.type = type;
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
}
