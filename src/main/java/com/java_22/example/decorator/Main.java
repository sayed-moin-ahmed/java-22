package com.java_22.example.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        System.out.println(component.operation());
        Component decorator = new DecoratorComponent(component);
        System.out.println(decorator.operation());
    }
}
