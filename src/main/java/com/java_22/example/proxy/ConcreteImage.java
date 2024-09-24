package com.java_22.example.proxy;

public class ConcreteImage implements Image{
    private String filename;
    ConcreteImage(String filename) {
        this.filename = filename;
        System.out.println("Loading image...");
    }

    @Override
    public String display() {
        return filename;
    }
}
