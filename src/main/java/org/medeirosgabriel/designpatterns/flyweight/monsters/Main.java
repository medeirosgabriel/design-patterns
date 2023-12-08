package org.medeirosgabriel.designpatterns.flyweight.monsters;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        int length = 10;
        long size1 = 0;
        for (int i = 0; i < length; i++) {
            MonsterType type = MonsterFactory.getTreeType("1", (float) 2.0, 30, 50);
            Monster1 monster = new Monster1(type, 10, 100);
            oos.writeObject(monster);
            oos.flush();
            size1 += baos.toByteArray().length;;
        }
        long size2 = 0;
        for (int i = 0; i < length; i++) {
            Monster2 monster = new Monster2(10, 100, "2", (float) 2.0, 30, 50);
            oos.writeObject(monster);
            oos.flush();
            size2 += baos.toByteArray().length;
        }

        System.out.println("List of first object: " + size1);
        System.out.println("List of second object: " + size2);
    }
}