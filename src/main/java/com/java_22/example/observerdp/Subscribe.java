package com.java_22.example.observerdp;

public interface Subscribe {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String name);
}
