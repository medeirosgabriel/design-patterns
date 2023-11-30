package org.medeirosgabriel.designpatterns.factory;

import javax.print.Doc;

public class DogFactory extends PetFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
