package com.niroshan.design.patterns.behavioral.template;

public class PenneAlfredo extends PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("add penne");
    }

    @Override
    protected void addSause() {
        System.out.println("add chiken");
    }

    @Override
    protected void addProtein() {
        System.out.println("add alfredo sause");
    }

    @Override
    protected void addGarnish() {
        System.out.println("add pasley");
    }
}
