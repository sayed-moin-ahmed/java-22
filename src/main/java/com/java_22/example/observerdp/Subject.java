package com.java_22.example.observerdp;

public sealed interface Subject permits ConcreteSubject {
void addObserver(Observer observer);
void removeObserver(Observer observer);
void notifyObservers();
}
