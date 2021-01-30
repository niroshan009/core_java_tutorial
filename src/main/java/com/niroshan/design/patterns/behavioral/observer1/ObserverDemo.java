package com.niroshan.design.patterns.behavioral.observer1;

public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver((String event) -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
}