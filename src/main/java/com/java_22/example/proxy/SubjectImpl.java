package com.java_22.example.proxy;

public class SubjectImpl implements ISubject {
    @Override
    public void request() {
        System.out.println("Request made");
    }
}
