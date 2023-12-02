package org.medeirosgabriel.designpatterns.strategy.calculator;

public class Sum implements Operation {

    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
