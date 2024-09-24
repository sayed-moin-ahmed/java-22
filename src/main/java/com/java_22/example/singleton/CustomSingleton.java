package com.java_22.example.singleton;

public class CustomSingleton {

    private int value;

    private static  volatile CustomSingleton instance;

    public static CustomSingleton getInstance() {

        if(instance == null) {
            synchronized(CustomSingleton.class) {
                if(instance == null) {
                    instance = new CustomSingleton();
                }
            }
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
