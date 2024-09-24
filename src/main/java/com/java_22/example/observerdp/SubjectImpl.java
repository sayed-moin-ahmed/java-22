package com.java_22.example.observerdp;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public <T> void notifyObservers(T Type) {
        for (Observer observer : observers) {
            observer.update(Type);
        }
    }


}
