package com.niroshan.design.patterns.behavioral.state;

public class CurrentState implements State{
    Board board;

    public CurrentState(Board board) {
        this.board = board;
    }

    @Override
    public void move(Board state) {

    }

    @Override
    public void undo(Board state) {

    }
}
