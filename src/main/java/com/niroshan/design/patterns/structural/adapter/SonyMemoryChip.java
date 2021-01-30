package com.niroshan.design.patterns.structural.adapter;

public class SonyMemoryChip implements LocalMemoryChip {
    int size;
    public SonyMemoryChip(int size){
        this.size = size;
    }
    @Override
    public void readMemoryChip() {
        System.out.println("reading from "+this.size+" GB sony memory chip");
    }

    @Override
    public void writeMemoryChip() {
        System.out.println("writing to "+this.size+" GB sony memory chip");
    }
}
