package com.java_22.example.visitor;

import com.java_22.example.visitor.showroom.Showroom;

public class Customer implements Visitor {



    @Override
    public void visit(Showroom showroom) {
        System.out.println("Customer visited the showroom"+showroom);
    }
}
