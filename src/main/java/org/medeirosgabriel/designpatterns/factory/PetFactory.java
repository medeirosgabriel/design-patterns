package org.medeirosgabriel.designpatterns.factory;

public class PetFactory {

    public Animal createAnimal() {
        return null;
    }

    public void talk() {
        Animal animal = this.createAnimal();
        System.out.println(animal.talk());
    }
}
