package com.java_22.example.template;

public abstract class SystemBuild {

    public void build() {
        System.out.println("Building the system...");
        buildFoundation();
        buildStructure();
        buildRoof();
        buildInterior();
        System.out.println("System built.");
    }

    protected abstract void buildFoundation();

    protected abstract void buildStructure();

    protected abstract void buildRoof();

    protected abstract void buildInterior();

}
