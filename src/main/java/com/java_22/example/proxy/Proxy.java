package com.java_22.example.proxy;

public class Proxy  implements Image{
    private ConcreteImage image;

    public Proxy(String name){
        this.image = new ConcreteImage(name);
    }

    @Override
    public String display() {
        return  image.display();
    }
}
