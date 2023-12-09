package org.medeirosgabriel.designpatterns.observer;

public class Counter implements Observer {

    private long id;

    public Counter(long id) {
        this.id = id;
    }

    @Override
    public void count(int number) {
        System.out.println(String.format("Observer %d: %d", this.id, number));
    }
}
