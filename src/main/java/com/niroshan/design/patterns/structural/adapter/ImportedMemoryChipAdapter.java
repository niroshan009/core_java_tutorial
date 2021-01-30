package com.niroshan.design.patterns.structural.adapter;

public class ImportedMemoryChipAdapter implements LocalMemoryChip {
    private SandiskMemoryChip sandiskMemoryChip;
    public ImportedMemoryChipAdapter(SandiskMemoryChip sandiskMemoryChip)
    {
        this.sandiskMemoryChip = sandiskMemoryChip;
    }
    @Override
    public void readMemoryChip() {
        this.sandiskMemoryChip.readFromMemoryChip();
    }

    @Override
    public void writeMemoryChip() {
        this.sandiskMemoryChip.writeToMemoryChip();
    }
}
