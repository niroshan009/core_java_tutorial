package com.niroshan.design.patterns.behavioral.state;

public class PreviousState implements State{

    private Board board ;

    public PreviousState(Board board) {
        this.board = board;
    }

    @Override
    public void move(Board state) {

    }

    @Override
    public void undo(Board state) {
        this.board = state;
    }
}
