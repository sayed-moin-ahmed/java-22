package com.java_22.example.observerdp;

@FunctionalInterface
public interface Observer {
    <T> void update(T value);
}
