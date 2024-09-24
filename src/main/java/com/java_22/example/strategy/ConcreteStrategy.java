package com.java_22.example.strategy;

public record ConcreteStrategy(Strategy strategy) implements Strategy {
    @Override
    public void calculate(int a, int b) {
        strategy.calculate(a, b);
    }
}
