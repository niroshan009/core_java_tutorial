package com.niroshan.design.patterns.structural.adapter;

public class SandiskMemoryChip implements ImportedMemoryChip {



    @Override
    public void readFromMemoryChip() {
        System.out.println("Reading from imporeted Sandisk memory chip");
    }

    @Override
    public void writeToMemoryChip() {
        System.out.println("Writing to imported Sandisk Memeory chip");
    }
}
