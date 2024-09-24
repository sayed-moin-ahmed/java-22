package com.java_22.example.template;

public class ConcreteSystemBuild extends SystemBuild{
    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation");
    }

    @Override
    protected void buildStructure() {
        System.out.println("Building structure");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building roof");
    }

    @Override
    protected void buildInterior() {
        System.out.println("Building interior");
    }
}
