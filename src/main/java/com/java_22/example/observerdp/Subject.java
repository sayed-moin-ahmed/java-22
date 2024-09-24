package com.java_22.example.observerdp;


public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    <T> void notifyObservers(T Type);
}
