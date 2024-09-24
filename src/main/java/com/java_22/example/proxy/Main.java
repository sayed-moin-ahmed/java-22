package com.java_22.example.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new Proxy("image.jpg");
        System.out.println(image.display());
    }
}
