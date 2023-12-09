package org.medeirosgabriel.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class InputObservable implements Observable {

    private List<Observer> observers;
    public int number;

    public InputObservable() {
        this.observers = new ArrayList<>();
        this.number = 0;
    }

    public void increment() {
        this.number += 1;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o -> o.count(this.number));
    }
}
