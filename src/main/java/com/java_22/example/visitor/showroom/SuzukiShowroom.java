package com.java_22.example.visitor.showroom;

import com.java_22.example.visitor.Visitor;
import com.java_22.example.visitor.car.Car;

import java.util.ArrayList;
import java.util.List;

public class SuzukiShowroom implements Showroom {
    List<Car> cars = new ArrayList<>(10);
    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
