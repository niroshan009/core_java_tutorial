package com.niroshan.generic;



/*
 *
 * This is a Generic class
 * You can see that Pair<T> definition
 * This has a two constructios one is default and one takes any type of argumant and initialize two private variables
 *
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;
    }

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue){
        second = newValue;
    }


}
