package com.java_22.example.strategy;

public class Main {
    public static void main(String[] args) {
        Strategy add = (a, b) -> System.out.println(a + b);
        Strategy subtract = (a, b) -> System.out.println(a - b);
        Strategy multiply = (a, b) -> System.out.println(a * b);
        Strategy divide = (a, b) -> System.out.println(a / b);

     Strategy  concreteStrategy = new ConcreteStrategy(add);
        concreteStrategy.calculate(5, 3);

        concreteStrategy = new ConcreteStrategy(subtract);
        concreteStrategy.calculate(5, 3);

        concreteStrategy = new ConcreteStrategy(multiply);
        concreteStrategy.calculate(5, 3);

        concreteStrategy = new ConcreteStrategy(divide);
        concreteStrategy.calculate(5, 3);

    }
}
