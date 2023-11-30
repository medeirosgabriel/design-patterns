package org.medeirosgabriel.designpatterns.factory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PetFactory factory;
        factory = new CatFactory();
        factory.talk();
        factory = new DogFactory();
        factory.talk();
    }
}