package com.java_22.example.proxy;

public record Proxy(ISubject ISubject) implements ISubject {

    @Override
    public void request() {
        System.out.println("Proxy request made");
        ISubject.request();
    }

}
