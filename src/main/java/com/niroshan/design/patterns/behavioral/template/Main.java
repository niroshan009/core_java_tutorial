package com.niroshan.design.patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        PastaDish spag = new SpaghettiMeatballs();
        spag.makeRecipe();

        System.out.println("====================");
        PastaDish penne = new PenneAlfredo();
        penne.makeRecipe();
    }
}
