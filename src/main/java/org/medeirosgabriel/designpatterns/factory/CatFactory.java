package org.medeirosgabriel.designpatterns.factory;

public class CatFactory extends PetFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
