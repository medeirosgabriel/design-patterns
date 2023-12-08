package org.medeirosgabriel.designpatterns.flyweight.monsters;

import java.util.HashMap;
import java.util.Map;

public class MonsterFactory {

    static Map<String, MonsterType> monsterTypes = new HashMap<>();

    public static MonsterType getTreeType(String name, float height, int strength, int defense) {
        MonsterType result = monsterTypes.get(name);
        if (result == null) {
            result = new MonsterType(name, height, strength, defense);
            monsterTypes.put(name, result);
        }
        return result;
    }
}
