package com.java_22.example.visitor;

import com.java_22.example.visitor.car.Dezire;
import com.java_22.example.visitor.car.Slavia;
import com.java_22.example.visitor.showroom.Showroom;
import com.java_22.example.visitor.showroom.SkodaShowroom;
import com.java_22.example.visitor.showroom.SuzukiShowroom;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        var ppsSkoda = new SkodaShowroom();
        var bimal = new SuzukiShowroom();
        var slavia = new Slavia();
        var desire = new Dezire();
        ppsSkoda.addCar(slavia);
        bimal.addCar(desire);
        Visitor customer = (s) -> {
            System.out.println("Customer visited the showroom");
        };
        ppsSkoda.accept(customer);

    }
}
