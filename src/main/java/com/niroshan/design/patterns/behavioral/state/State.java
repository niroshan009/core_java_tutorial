package com.niroshan.design.patterns.behavioral.state;

public interface State {
    public void move(Board state);
    public void undo(Board state);
}
