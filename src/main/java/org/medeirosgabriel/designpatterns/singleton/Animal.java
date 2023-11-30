package org.medeirosgabriel.designpatterns.singleton;

public final class Animal {
    private static Animal instance;
    private String name = "Bud";
    public static Animal getInstance() {
        if (instance == null) {
            instance = new Animal();
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
