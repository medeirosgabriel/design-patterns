package org.medeirosgabriel.designpatterns.observer;

import org.medeirosgabriel.designpatterns.flyweight.monsters.Monster1;
import org.medeirosgabriel.designpatterns.flyweight.monsters.Monster2;
import org.medeirosgabriel.designpatterns.flyweight.monsters.MonsterFactory;
import org.medeirosgabriel.designpatterns.flyweight.monsters.MonsterType;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        InputObservable input = new InputObservable();
        input.subscribe(new Counter(1));
        input.subscribe(new Counter(2));
        input.subscribe(new Counter(3));

        Random random = new Random();
        int limitInferior = 1000;
        int limitSuperior = 3000;

        while (true) {
            input.increment();
            int randomNumber = random.nextInt(limitSuperior - limitInferior + 1) + limitInferior;
            Thread.sleep(randomNumber);
        }
    }
}