package io.github.aarvedahl;

public class Espresso extends Beverage {

    public Espresso() {
        super();
        description = "Espresso";
    }
    @Override
    Double cost() {
        return 15.00;
    }
}
