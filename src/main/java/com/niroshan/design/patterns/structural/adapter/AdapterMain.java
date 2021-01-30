package com.niroshan.design.patterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args){
        LocalMemoryChip sonyChip = new SonyMemoryChip(128  );
        sonyChip.writeMemoryChip();
        sonyChip.readMemoryChip();

        SandiskMemoryChip sandiskMemoryChip = new SandiskMemoryChip();
        LocalMemoryChip localMemoryChip = new ImportedMemoryChipAdapter(sandiskMemoryChip);
        localMemoryChip.writeMemoryChip();
        localMemoryChip.readMemoryChip();

    }
}
