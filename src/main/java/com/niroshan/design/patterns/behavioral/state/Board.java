package com.niroshan.design.patterns.behavioral.state;

import java.util.List;

public class Board {
    private int x;
    private int y;
    private List<Piece> white;
    private List<Piece> black;

    State currentState;
    State previousState;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
        currentState = new CurrentState(this);
        previousState = new PreviousState(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void undo(){
        State tempState = currentState;
        currentState = (CurrentState)previousState;
        previousState = (PreviousState) tempState;

    }

    public void redo() {
        State tempState = currentState;
        currentState = (CurrentState)previousState;
        previousState = (PreviousState) tempState;
    }
}
