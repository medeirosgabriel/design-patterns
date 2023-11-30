package org.medeirosgabriel.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.getInstance();
        System.out.println(animal.getName());
    }
}