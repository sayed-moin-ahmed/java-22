package com.java_22.example.decorator;

public class DecoratorComponent extends AbstractComponent{

    DecoratorComponent(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "Concrete Decorator: " + super.operation();
    }

}
