package com.niroshan.design.patterns.behavioral.state;

public abstract class Piece {
    int x,y;
    String name;


    public Piece(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void undo(int x, int y) {
        this.x = x;
        this.y= y;
    }
}
