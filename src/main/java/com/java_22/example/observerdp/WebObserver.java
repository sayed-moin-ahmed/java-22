package com.java_22.example.observerdp;

public class WebObserver implements Observer{
    @Override
    public <T> void update(T value) {
        System.out.println("WebObserver updated with value: " + value);
    }

}
