package org.medeirosgabriel.designpatterns.strategy.calculator;

public class Main {
    public static void main(String[] args) {
        // result = x - 5 + 3
        int x = 10;
        Operation op = new Subtraction();
        int result = op.calculate(x, 5);
        System.out.println(result);
        op = new Sum();
        result = op.calculate(result, 3);
        System.out.println(result);
    }
}
