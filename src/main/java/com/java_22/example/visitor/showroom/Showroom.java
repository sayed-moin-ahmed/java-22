package com.java_22.example.visitor.showroom;

import com.java_22.example.visitor.Visitor;
import com.java_22.example.visitor.car.Car;

public interface Showroom {
    void accept(Visitor visitor);
    void addCar(Car car);
}
