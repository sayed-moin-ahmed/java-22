package com.java_22.example.decorator;

public abstract class AbstractComponent  implements Component {

    private final Component component;

    AbstractComponent(Component component){
        this.component = component;
    }
    @Override
    public String operation() {
      return "Abstract Decorator:"+ component.operation();
    }
}
