package com.niroshan.design.patterns.behavioral.template;

public abstract class PastaDish {
    public final void makeRecipe() {

        this.boilWater();
        this.addPasta();
        this.cookPasta();
        this.drainAndPlate();
        addSause();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();

    protected abstract void addSause();
    protected abstract void addProtein();
    protected abstract void addGarnish();




    private void boilWater() {
        System.out.println("boiling water");
    }



    private void cookPasta() {
        System.out.println("cooking pasta");
    }

    private void drainAndPlate() {
        System.out.println("drain and plate");
    }


}
