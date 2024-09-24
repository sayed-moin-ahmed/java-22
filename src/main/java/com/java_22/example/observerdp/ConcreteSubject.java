package com.java_22.example.observerdp;

import java.util.ArrayList;
import java.util.List;

public final record   ConcreteSubject(String type) implements Subject {

    private static List<Observer> subjects = new ArrayList<>();

    @Override
    public String type() {
        notifyObservers();
        return type;
    }

    @Override
    public void addObserver(Observer observer) {
        subjects.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subjects.remove(observer);
    }

    @Override
    public void notifyObservers() {
        subjects.forEach(observer -> observer.update(type));
    }
}
