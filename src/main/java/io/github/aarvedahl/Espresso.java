package io.github.aarvedahl;

public class Espresso extends Beverage {

    public Espresso() {
        super();
        description = "Espresso";
        timeToMake = 3;
    }
    @Override
    public Double cost() {
        return 15.99;
    }
}
