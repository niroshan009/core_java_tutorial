package com.niroshan.design.patterns.behavioral.template;

public class SpaghettiMeatballs extends  PastaDish{

    @Override
    protected void addPasta() {
        System.out.println("add spaghetti");
    }

    @Override
    protected void addSause() {
        System.out.println("add meatballs");
    }

    @Override
    protected void addProtein() {
        System.out.println("add tomato sause");
    }

    @Override
    protected void addGarnish() {
        System.out.println("add parmesan cheese");
    }
}
