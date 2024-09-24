package com.java_22.example.observerdp;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        Observer tvObserver = new TVObserver();
        Observer webObserver = new WebObserver();
        subject.registerObserver(tvObserver);
        subject.registerObserver(webObserver);
        subject.notifyObservers("Hello");
        subject.removeObserver(tvObserver);
        subject.notifyObservers("World");
    }
}