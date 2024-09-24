package com.java_22.example.observerdp;

public class TVObserver implements Observer {

    @Override
    public <T> void update(T value) {
        System.out.println("TVObserver updated with value: " + value);
    }

}
