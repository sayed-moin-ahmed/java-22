package com.java_22.example.visitor.showroom;

import com.java_22.example.visitor.Visitor;
import com.java_22.example.visitor.car.Car;

import java.util.ArrayList;
import java.util.List;

public class SkodaShowroom implements Showroom {
    private List<Car> cars = new ArrayList<>(10);

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }
}
