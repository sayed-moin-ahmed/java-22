package com.java_22.example.observerdp;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Subscribe {

    private List<Observer> observers= new ArrayList<Observer>();

    @Override
    public void subscribe(Observer observer) {
        observers.addLast(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String name) {
        observers.stream().forEach(e->e.update(name));
    }


}
