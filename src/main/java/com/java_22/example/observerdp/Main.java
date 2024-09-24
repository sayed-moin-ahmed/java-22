package com.java_22.example.observerdp;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject("Hello, World!");
        Observer observer1 = (message) -> System.out.println("Observer 1: " + message);
        Observer observer2 = (message) -> System.out.println("Observer 2: " + message);
        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.notifyObservers();
    }
}